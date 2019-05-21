package recursmult; 

import java.util.Scanner;

public class WeekLab101RecursMult
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Please enter the first number: ");
        int num1 = key.nextInt();
        
        System.out.print("Please enter a second number: ");
        int num2 = key.nextInt();
        
        System.out.println("The multiplication of " + num1 +
                         " and " + num2 + " is: " + mult(num1, num2));
    }

    public static int mult(int num1, int num2) 
    {
        if(num1 > 0)
        {
            return num2 + mult(num2, num1-1);
        }
        return 0;
    }

}
