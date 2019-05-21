package findmax; 

public class WeekLab104FindMax 
{
    public static void main(String[] args) 
    {
        int[] arry = {0,1,2,3,4,5,6,25,7,8,9};
        
        System.out.print("The array is as follows: \n[ ");
        for(int i = 0; i < arry.length; i++)
        {
            System.out.print(arry[i] + " ");
        }
        System.out.print("]\n");
        
        System.out.println("The max element in the array is: " + isMax(arry, arry[0], 0));
    }
    
    public static int isMax(int[] arry,int max, int currPos)
    {
        if(currPos == arry.length)
            return max;
        
        else if(max < arry[currPos])
            return isMax(arry, arry[currPos], currPos+1);
        
        else
         return isMax(arry, max, currPos+1);
    }

}
