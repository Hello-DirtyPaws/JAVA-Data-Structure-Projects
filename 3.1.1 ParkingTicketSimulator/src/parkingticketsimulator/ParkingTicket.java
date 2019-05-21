/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #1.3
 */

package parkingticketsimulator;

public class ParkingTicket 
{
    private ParkedCar car;
    private PoliceOfficer officer;
    private int fine;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer) 
    {
        this.car = car;
        this.officer = officer;
    }
    
    public ParkingTicket(ParkingTicket obj)
    {
        this.car = obj.car;
        this.officer = obj.officer;
    }

    public ParkedCar getCar() 
    {
        return car;
    }
    
    public void setCar(ParkedCar car) 
    {
        this.car = car;
    }

    public PoliceOfficer getOfficer() 
    {
        return officer;
    }

    public void setOfficer(PoliceOfficer officer) 
    {
        this.officer = officer;
    }
    
    public void calculateFine()
    {
        int timeDifference = officer.patrol();
        if(timeDifference > 0)
        {
            fine = 25 + 10 * (timeDifference / 60);
        }   
        else
        {
            fine = 0;
        }
    }
    
    public int getFine()
    {
        calculateFine();
        return this.fine;
    }
    
    public String toString()
    {
        String ticket = car.toString() + 
                        "\n\nOfficer Name: " + officer.getName() + 
                        ", Badge No.: " + officer.getBadgeNo();
                        
        if(getFine() > 0)
        {
            ticket += "\n\nThe no. of minutes illegally parked is " + officer.patrol() + " mins.\n";
            ticket += String.format("%s $%.2f","Thus, the fine amount charged is" , (double)this.fine);
            ticket += "\n*************************************";
        }
        else
        {
            ticket += "\nNo crimes committed."
                    + "\n*************************************";
        }
        return ticket;
    }
}
