package phonecompdemo; 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneCompDemo 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PhoneDetails p = new PhoneDetails();
        Scanner read = new Scanner(new FileReader("phone.txt"));
        
        p.readNAdd(read);
        
        System.out.println("1. Display."
                + "\n2. Sort by Manufactrer and display."
                + "\n3. Sort by Price and display."
                + "\n4. Search price by model number.");
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("\nPlease enter your choice here: ");
        int choice = kb.nextInt();
        
        System.out.println();
        
        switch(choice)
        {
            case 1: 
                System.out.println(p);
                break;
            case 2: 
                p.sortByManuf();
                System.out.println(p);
                break;
            case 3: 
                p.sortByPrice();
                System.out.println(p);
                break;
            case 4:
                System.out.print("Please enter the model number: ");
                String mdl = kb.next();
                System.out.println("The price for the model number " + mdl + " is: $" + p.search(mdl));
                break;
        }
        
                
    }

}
