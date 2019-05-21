package findmember; 

public class WeekLab102FindMember 
{
    public static void main(String[] args) 
    {
        int[] arry = {0,1,2,3,4,5,6,7,8,9};
        int val = 5;
        System.out.print("The array is as follows: \n[ ");
        for(int i = 0; i < arry.length; i++)
        {
            System.out.print(arry[i] + " ");
        }
        System.out.print("]\n");
        System.out.println("Is 5 present in the array?: " + isMember(arry, val, 0));
    }
    
    public static boolean isMember(int[] arry, int val, int currPos)
    {
        if(currPos == arry.length)
            return false;
        
        else if(arry[currPos] == val)
        return true;
        
        else 
            return isMember(arry, val, currPos+1);
    }

}
