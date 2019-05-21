package stringreverser; 

import java.util.Scanner;

public class Week101StringReverser 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = key.nextLine();
        System.out.print("The string in reverse order is: ");
        strReverser(input);
    }

    public static void strReverser(String input) 
    {
        if(input.length() > 0)
        {
            strReverser(input.substring(1));
            System.out.print(input.charAt(0));
        }        
    }

}
