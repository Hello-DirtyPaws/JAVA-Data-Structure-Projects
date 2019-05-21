/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #4
 */

package recursion; 

public class Recursion 
{
    public static void main(String[] args) 
    {
        int [] arry = new int [10];
        
        for(int i = 1; i <= 10; i++)
            arry[i-1] = i * 2;
        
        checkNPrint(0, arry);
    }

    public static void checkNPrint(int i, int[] arry) 
    {
        if(i <= 20)
        {
            boolean exist = false;
            
            System.out.printf("%02d %s ",i, "exists:");
                        
            for(int j = 0; j < 10; j++)
            {
                if(arry[j] == i)
                {
                    System.out.println("True.");
                    exist = true;
                    break;
                }
            }
            
            if(!exist)                
                System.out.println("False.");
            
            checkNPrint(++i, arry);
        }
    }

}
