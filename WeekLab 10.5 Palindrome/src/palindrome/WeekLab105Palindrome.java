package palindrome; 

import java.util.Scanner;

public class WeekLab105Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = key.nextLine();
        System.out.println("Is it a palindrome?: " + isPalindrome(str, 0));
    }
    
    public static boolean isPalindrome(String str, int currPos)
    {
        if(((currPos + 1) * 2) > str.length())
            return true;
        else
        {
            if(str.charAt(currPos) == str.charAt(str.length() - currPos - 1))
                return isPalindrome(str, currPos+1);
            else 
                return false;
        }
    }

}
