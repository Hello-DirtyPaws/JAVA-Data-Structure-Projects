package jayassignment; 

import java.util.Scanner;

public class JayAssignment 
{
    public static void main(String[] args) 
    {
        //Getting the size from the user
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = key.nextInt();
        
        //initializing the array
        int[] arry = makeArray(size);
        System.out.println("Printing the regular array...");
        printArray(arry);
        
        //shuffling the array
        shuffle(arry);
        System.out.println("Printing the shuffled array...");
        printArray(arry);    
        
    }
    
    public static void printArray(int[] arry)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < arry.length - 1; i++) 
        {
            System.out.print(arry[i] + ", ");
        }
        System.out.println(arry[i] + "]");
    }
    
    public static int[] makeArray(int n)
    {
        //creates an array of size n
        int[] arry = new int[n];
        for(int i = 0; i < n; i++)
        {
            //stores integers 1 to n into the array
            arry[i] = i+1;
        }
        return arry;
    }
    
    public static void shuffle(int[] arry)
    {
        int randLoc, temp;
        for(int i = 0; i < arry.length; i++)
        {
            randLoc = (int)(Math.random() * arry.length);
            
            //swapping the values
            temp = arry[i];
            arry[i] = arry[randLoc];
            arry[randLoc] = temp;
        }
    }

}
