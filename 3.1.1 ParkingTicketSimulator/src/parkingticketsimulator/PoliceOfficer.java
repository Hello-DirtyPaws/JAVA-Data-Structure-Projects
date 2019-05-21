/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #1.4
 */

package parkingticketsimulator;

public class PoliceOfficer 
{
    private String name;
    private int badgeNo;
    private ParkingMeter meter;
    private ParkedCar car;

    public PoliceOfficer(String name, int badgeNo, ParkingMeter meter, ParkedCar car) 
    {
        this.name = name;
        this.badgeNo = badgeNo;
        this.meter = meter;
        this.car = car;
    }
    
    public PoliceOfficer(PoliceOfficer obj)
    {
        this.name = obj.name;
        this.badgeNo = obj.badgeNo;
        this.meter = obj.meter;
        this.car = obj.car;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getBadgeNo() 
    {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) 
    {
        this.badgeNo = badgeNo;
    }
    
    public int patrol()
    {
        return car.getMinutesParked() - meter.getMinutesPurchased();
    }

    public String toString() 
    {        
        ParkingTicket ticket = new ParkingTicket(car, this);
        
        return ticket.toString();
    }
    
}
