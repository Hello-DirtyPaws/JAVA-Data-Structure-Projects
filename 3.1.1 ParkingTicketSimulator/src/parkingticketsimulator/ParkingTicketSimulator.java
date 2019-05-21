/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #1
 */

package parkingticketsimulator;

public class ParkingTicketSimulator 
{
    public static void main(String[] args) 
    {
        ParkedCar car = new ParkedCar("Volkswagon", 1972, "Red", "147RHZM", 125);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliceOfficer("Joe Friday", 4788, meter, car);
        
        System.out.println(officer);
    }

}
