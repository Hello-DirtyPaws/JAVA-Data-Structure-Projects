package chargeaccntsort; 

import java.util.Scanner;

public class Week112ChargeAccntSort 
{
    public static void main(String[] args) 
    {
        ChargeAccntSortHelper obj = new ChargeAccntSortHelper();
        
        System.out.println("The account numbers unsorted: ");
        for(int i = 0; i < obj.array.length; i++)
        {
            System.out.print(obj.array[i] + " ");
        }
        
        obj.selectionSort();
        System.out.println("\n\nThe account numbers sorted: ");
        for(int i = 0; i < obj.array.length; i++)
        {
            System.out.print(obj.array[i] + " ");
        }
        
        Scanner key = new Scanner(System.in);
        System.out.print("\n\nPlease enter the account number: ");
        int userChoice = key.nextInt();
        
        String decision = "valid.";
        if(!obj.exist(userChoice))
            decision = "invalid.";
        
        System.out.println("The account number " + userChoice + " is: " + decision);
    }

}


