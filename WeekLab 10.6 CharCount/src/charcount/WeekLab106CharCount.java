package charcount; 

public class WeekLab106CharCount 
{
    public static void main(String[] args) 
    {
        char[] arry = {'a','b','c','d','e','e','e','f','g','g'};
        char charToCount = 'e'; 
        
        System.out.print("The array is as follows: \n[ ");
        for(int i = 0; i < arry.length; i++)
        {
            System.out.print(arry[i] + " ");
        }
        System.out.print("]\n");
        
        System.out.println("The character count for \'"+ charToCount + "\' is: " + charCount(arry, charToCount, 0));
    }
    
    public static int charCount(char[] charArr, char c, int currPos)
    {
        int count = 0;
        
        if(currPos < charArr.length)
        {
            if(c == charArr[currPos])
            {
                count = 1;
                count += charCount(charArr, c, currPos+1);
            }
            else
            {
                count += charCount(charArr, c, currPos+1);
            }
        }
        
        return count;
    }

}
