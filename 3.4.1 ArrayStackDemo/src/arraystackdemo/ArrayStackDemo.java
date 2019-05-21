/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #1
 */

package arraystackdemo; 

import java.util.Scanner;

public class ArrayStackDemo 
{
    public static ArrayStack<Integer> stack;
    
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a positive number(>1): ");
        int num = key.nextInt();
        
        //Validating the input int
        while(num <= 1)
        {
            System.out.print("Please re-enter a positive number(>1): ");
            num = key.nextInt();
        }
        
        process(num);
        System.out.println(print(num));
    }

    private static void process(int num) 
    {
        stack = new ArrayStack(50);
        
        while(num % 2 == 0)
        {
            try 
            {
                stack.push(2);
            } 
            catch (StackException ex) 
            {
                System.out.println(ex.getMessage());
            }
            num = num / 2;
        }
        
        for(int i = 3; i <= num; i = i + 2)
        {
            while(num % i == 0)
            {
                try
                {
                    stack.push(i);
                    num = num / i;
                }
                catch(StackException ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    
    public static String print(int num)
    {
        String s = num + " = ";
        while(!stack.isEmpty())
        {
            try
            {
                s += stack.peek() + " * ";
                stack.pop();
            }
            catch(StackException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        
        s = s.substring(0, s.length() - 2); 
        return s;
    }

}
