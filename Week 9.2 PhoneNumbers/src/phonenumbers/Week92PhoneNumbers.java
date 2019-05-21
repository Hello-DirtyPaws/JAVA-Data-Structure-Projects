package phonenumbers; 

import java.util.Scanner;

public class Week92PhoneNumbers 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a phone number "
                + "(may contain alphabets) in format 'xxx-xxx-xxxx': ");
        String num = key.next();
        
        System.out.println("The phone number in all numbers is: " + charToNum(num));
    }

    public static String charToNum(String num) 
    {
        num = num.toUpperCase();
        String phoneNum = "";
        
        for(int i = 0; i < num.length(); i++)
        {
            switch (num.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    phoneNum += '2';
                    break;
                case 'D':
                case 'E':
                case 'F':
                    phoneNum += '3';
                    break;
                case 'G':
                case 'H':
                case 'I':
                    phoneNum += '4';
                    break;
                case 'J':
                case 'K':
                case 'L':
                    phoneNum += '5';
                    break;
                case 'M':
                case 'N':
                case 'O':
                    phoneNum += '6';
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    phoneNum += '7';
                    break;
                case 'T':
                case 'U':
                case 'V':
                    phoneNum += '8';
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    phoneNum += '9';
                    break;
                default:
                    phoneNum +=num.charAt(i);
                    break;
            }
        }
        
        return phoneNum;
    }

}
