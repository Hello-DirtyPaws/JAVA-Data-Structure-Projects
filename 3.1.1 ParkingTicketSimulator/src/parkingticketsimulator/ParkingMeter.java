/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #1.2
 */

package parkingticketsimulator;

public class ParkingMeter 
{
    private int minutesPurchased;

    public ParkingMeter(int minutesPurchased) 
    {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased()
    {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) 
    {
        this.minutesPurchased = minutesPurchased;
    }
    
}
