package lockdemo; 

/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 2 #1
 */

import java.util.Scanner;

public class LockDemo 
{
    public static Scanner key = new Scanner(System.in);
    public static void main(String[] args) 
    {        
        System.out.println("1: Set the lock combination.\n"
                         + "2: Close the lock.\n"
                         + "3: Check Status.\n"
                         + "4: Attempt to open.\n"
                         + "5: Check what the dial is currently pointing at.\n"
                         + "6: Exit the program.\n"
                         + "--------------------------------------------------");
        
        System.out.print("Please select one of the options listed above: ");
        
        //Gives [1-6] int input
        int input = giveInput(1, 6);
        
        operate(input);
    }

    public static int giveInput(int strt, int end) 
    {      
        if(key.hasNextInt())
        {
            int input = key.nextInt();
            
            if(input <= end && input >= strt)
            return input;
            
            else
            {
                System.out.print("\nINVALID CHOICE. PLEASE TRY AGAIN: ");
                return giveInput(strt, end);
            }
        }
        else
        {
            System.out.print("\nINVALID CHOICE. PLEASE TRY AGAIN: ");
            return giveInput(strt, end);
        }
        
    }

    public static void operate(int input) 
    {    
        Lock lock = new Lock();
        
        switch(input)
        {
            case 1: 
            {
                System.out.print("Enter x: ");
                int x = giveInput(0, 39);
                System.out.print("Enter y: ");
                int y = giveInput(0, 39);
                System.out.print("Enter z: ");
                int z = giveInput(0, 39);
                
                lock.alter(x, y, z);
                break;
            }
            case 2:
            {
                lock.close();
                break;
            }
            case 3:
            {
                lock.inquire();
                break;
            }
            case 4: 
            {
                System.out.print("Enter x: ");
                int x = giveInput(0, 39);
                System.out.print("Enter y: ");
                int y = giveInput(0, 39);
                System.out.print("Enter z: ");
                int z = giveInput(0, 39);
                
                lock.attempt(x, y, z);
                break;
            }
            case 5: 
            {
                System.out.println("The dial is currently pointing at " + lock.getCurrent() + ".");
                break;
            }
            case 6:
            {
                //Do nothing
            }
        }
        System.out.println(lock);
    }

}
