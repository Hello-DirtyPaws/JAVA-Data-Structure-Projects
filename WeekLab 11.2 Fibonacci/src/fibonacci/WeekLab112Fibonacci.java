package fibonacci;

import java.util.Scanner;

public class WeekLab112Fibonacci 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: "); int number = sc.nextInt();
        
        System.out.println("\t\tComputing fibonacci terms using recursion.");
        
        long currentTime = System.currentTimeMillis();
        long previousTime;
        long elapsedTime = 0;
        for (int k = 0; k <= 5; k++)
        {
            previousTime = currentTime;
            System.out.print("The Fibonacci term at position ");
            System.out.print((number + k) + " is ");
            System.out.println(fib(number + k));
            currentTime = System.currentTimeMillis();
            elapsedTime = (currentTime - previousTime) / 1000;
            System.out.println("Computed in " + elapsedTime + " seconds.");
        }
        
        System.out.println("\n\t\tComputing fibonacci terms using iteration.");
        
        currentTime = System.currentTimeMillis();
        elapsedTime = 0;
        for (int k = 0; k <= 5; k++)
        {
            previousTime = currentTime;
            System.out.print("The Fibonacci term at position ");
            System.out.print((number + k) + " is ");
            System.out.println(fibItrative(number + k));
            currentTime = System.currentTimeMillis();
            elapsedTime = (currentTime - previousTime) / 1000;
            System.out.println("Computed in " + elapsedTime + " seconds.");
        }
    }

    public static long fib(long n) 
    {
        if (n <= 1) 
        {
            return 1;
        } 
        else 
        {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static long fibItrative(int i) 
    {
        long num1 = 0, num2 = 1, temp;
        
        for(int j = 0; j < i; j++)
        {
            temp = num2;
            num2 = num2 + num1;
            num1 = temp;
        }        
        return num2;
    }
}
