package power; 

import java.util.Scanner;

public class Week102Power 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Please enter the base: ");
        double base = key.nextDouble();
        
        System.out.print("Please enter a non-negative exponent: ");
        int expo = key.nextInt();
        
        System.out.println("The simplification of the " + base +
                         " raised to the power " + expo + " is: " + power(base, expo));
    }

    public static double power(double base, int expo) 
    {
        if(expo > 1)
        {
            return base * power(base, expo-1);
        }
        return base;
    }

}
