/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #1.1
 */

package parkingticketsimulator;

public class ParkedCar 
{
    private String make, color, licenseNumber;
    private int model, minutesParked;

    public ParkedCar(String make, int model, String color, String licenseNumber, int minutesParked) 
    {
        this.make = make;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.model = model;
        this.minutesParked = minutesParked;
    }
    
    public ParkedCar(ParkedCar obj)
    {
        this.make = obj.make;
        this.color = obj.color;
        this.licenseNumber = obj.licenseNumber;
        this.model = obj.model;
        this.minutesParked = obj.minutesParked;
    }

    public String getMake() 
    {
        return make;
    }

    public void setMake(String make) 
    {
        this.make = make;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getLicenseNumber() 
    {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) 
    {
        this.licenseNumber = licenseNumber;
    }

    public int getModel() 
    {
        return model;
    }

    public void setModel(int model)
    {
        this.model = model;
    }

    public int getMinutesParked() 
    {
        return minutesParked;
    }

    public void setMinutesParked(int minutesParked) 
    {
        this.minutesParked = minutesParked;
    }

    @Override
    public String toString() 
    {
        return  "Make = " + make +
                "\nColor = " + color + 
                "\nLicense Number = " + licenseNumber + 
                "\nModel = " + model + 
                "\nMinutes Parked = " + minutesParked + " mins. parked.";
    }
    
}
