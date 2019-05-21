package sum; 

import java.util.Scanner;

public class Week103Sum 
{
    public static void main(String[] args)  
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int num = key.nextInt();
        
        System.out.println("The sum of all numbers from 1 to " + num + 
                           " is: " + sum(num));
    }

    public static int sum(int num) 
    {
        if(num > 1)
        {
            return num + sum(num-1);
        }
        return 1;
    }

}
