/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 5 #1.1
 */

package mccairportdemo;

import java.util.Random;

public class MCCAirport 
{
    private final double LANDING_TIME = 3;
    private final double TAKE_OFF_TIME = 2;
    private final double LANDING_RATE = 10;
    private final double TAKE_OFF_RATE = 10;
    private final int ITERATIONS = 1440;
    
    //Time for which the runway is occupied
    private int runwayOccupiedTime; 
    
    private int totalLandingPlanes;
    private int totalTakeOffPlanes;
    
    private double totalWaitTimeLanding;
    private double totalWaitTimeTakeOff;
    private double totalLengthLanding;
    private double totalLengthTakeOff;
    
    public MCCAirport()
    {
        this.runwayOccupiedTime = 1;
        this.totalLengthLanding = 0;
        this.totalLengthTakeOff = 0;
        this.totalWaitTimeLanding = 0;
        this.totalWaitTimeTakeOff = 0;
        this.totalLandingPlanes = 0;
        this.totalTakeOffPlanes = 0;
    }

    public void initiate() 
    {
        ArryQueue<Plane> landingQueue = new ArryQueue<>(1440);
        ArryQueue<Plane> takeOffQueue = new ArryQueue<>(1440);
        
        for(int i = 0; i < ITERATIONS; i++)
        {
            
            //Adds current queue lengths to the respective queues
            //for every minute.
            totalLengthLanding += landingQueue.count();
            totalLengthTakeOff += takeOffQueue.count();
            
            //Generates two Plane objects randomly with the current time; i
            //and adds them to the respective queues.
            addPlanesInQueues(landingQueue, takeOffQueue, i);
            
            if(runwayOccupiedTime > 0)
                runwayOccupiedTime--;
            
            //if runway is free
            if(runwayOccupiedTime == 0)
            {
                //if landing queue is not empty
                if(landingQueue.count() != 0)
                {
                    //total time that particular plane has to wait is
                    //current time(i) - (the time when the plane was added)
                    totalWaitTimeLanding += (i - landingQueue.peek().getTimeAdded());
                    
                    landingQueue.dequeue();
                    runwayOccupiedTime = (int) LANDING_TIME;
                }
                
                //if landing queue is empty AND takeOff queue is not empty
                else if(takeOffQueue.count() != 0)
                {
                    totalWaitTimeTakeOff += (i - takeOffQueue.peek().getTimeAdded());
                    takeOffQueue.dequeue();
                    runwayOccupiedTime = (int) TAKE_OFF_TIME;
                }
            }
        }
    }

    public void addPlanesInQueues(ArryQueue<Plane> landingQueue,
                                  ArryQueue<Plane> takeOffQueue, 
                                  int currentTime) 
    {
        Random generator = new Random();
        if(generator.nextDouble() < (LANDING_RATE / 60))
        {
            landingQueue.enqueue(new Plane(currentTime));
            totalLandingPlanes++;
        }
        
        if(generator.nextDouble() < (TAKE_OFF_RATE / 60))
        {
            takeOffQueue.enqueue(new Plane(currentTime));
            totalTakeOffPlanes++;
        }
    }
    
    public String toString()
    {
        String intro = "\t\tAIRPORT DATA FOR 1DAY(24HRS)";
        String msg1 = String.format("%-30s %.6f %s","Average landing queue length:", 
                                    totalLengthLanding/ITERATIONS,
                                    "Planes per minute.");
        
        String msg2 = String.format("%-30s %8.6f %s","Average take off queue length:", 
                                    totalLengthTakeOff/ITERATIONS,
                                    "Planes per minute.");
        
        String msg3 = String.format("%-30s %.6f %s","Average landing queue time:", 
                                    totalWaitTimeLanding/totalLandingPlanes,
                                    "Minutes per plane.");
        
        String msg4 = String.format("%-30s %.6f %s","Average take off queue time:", 
                                    totalWaitTimeTakeOff/totalTakeOffPlanes,
                                    "Minutes per plane.");
        
        String output = intro + "\n" + msg1 + "\n" + msg2 + "\n" + msg3 + "\n" + msg4;
        return output;
    }
    
}
