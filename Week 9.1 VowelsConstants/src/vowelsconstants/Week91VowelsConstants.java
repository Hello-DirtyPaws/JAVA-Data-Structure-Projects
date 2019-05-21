package vowelsconstants; 

import java.util.Scanner;

public class Week91VowelsConstants 
{
    public static void main(String[] args) 
    {
        char userChoice;
        Scanner key = new Scanner(System.in);
        do
        {
            System.out.print("Please enter a string: ");
            String str = key.nextLine();
            
            VowelsConstants obj = new VowelsConstants(str);
            
            System.out.println("The number of vowels in the string is/are: " + obj.countVowels());
            
            System.out.println("The number of consonants in the string is/are: " + obj.countConsonants());
            
            System.out.println("The total number of vowels and consonants is/are: " + 
                    (obj.countVowels()+obj.countConsonants()));
            
            System.out.print("Enter 'e' to exit; anything else to enter a new string: ");
            userChoice = key.next().charAt(0);
            System.out.println("*********************************************************");
            key.nextLine();
        }while(userChoice != 'e');
    }

}
