package krushna_driverexam; 

import java.util.Scanner;

public class Krushna_DriverExam 
{
   static int ttlCrrctAns = 0;
   static char [] userAns;
    public static void main(String[] args) 
    {
         char [] correct ={'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 
                           'C', 'D', 'B','C', 'D', 'A', 'D', 'C', 
                           'C', 'B', 'D', 'A'}; 
         userAns = new char[20];
         Scanner k = new Scanner(System.in);
         for(int i = 0; i < 20; i++)
         {
             System.out.print("Please enter the input: ");
             userAns[i] = k.next().charAt(0);
             
             if(userAns[i]==correct[i])
             {
                 ttlCrrctAns++;
             }
         }
         
         if(passed())
         System.out.println("Cogratulations you are passed!!");
         else
             System.out.println("Sorry try again later.");
         
         System.out.println("Your score is: " + ttlCrrctAns + " out of 20.");
    }
    
    public static boolean passed()
    {
        return (ttlCrrctAns>=15);
    }
    
    public static int totalIncorrect()
    {
        return 20-ttlCrrctAns;
    }
    
    public static int totalQuestionMissed()
    {
        int miss = 0;
        for(int i = 0; i < 20; i++)
         {
             
             if(userAns[i] == ' ')
             {
                 miss++;
             }
         }
        
        return miss;
    }
    

}
