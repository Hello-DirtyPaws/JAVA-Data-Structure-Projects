package chargeaccnt; 

import java.util.Scanner;

public class WeekLab111ChargeAccnt 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the account number: ");
        int userChoice = key.nextInt();
        
        ChargeAccntHelper obj = new ChargeAccntHelper();
        String decision = "valid.";
        if(!obj.exist(userChoice))
            decision = "invalid.";
        
        System.out.println("The account number " + userChoice + " is: " + decision);
    }

}
