package reverseinsertion; 

public class WeekLab113ReverseInsertion 
{
    public static void main(String[] args) 
    {
        int[] arry = {0,19,1,14,2,15,3,10,11,13,4,16,5,12,6,18,7,17,8,20,9};
        System.out.println("Unsorted array: "); printArry(arry);
        System.out.println("**************************************"
                         + "*************************************");
        
        insertionSort(arry);
        System.out.println("Sorted array in reverse using insertion sort:"); printArry(arry);
        System.out.println("**************************************"
                         + "*************************************\n");
    }

    public static void printArry(int[] arry)
    {
        int i;
        System.out.print("[");
        for(i = 0; i < arry.length - 1; i++)
        {
            System.out.print(arry[i] + ", ");
        }
        System.out.println(arry[i] + "]");
    }
    
    public static void insertionSort(int[] array) 
    {
        int unsortedValue;  
        int scan; 
        
        for (int index = 1; index < array.length; index++)
        {
            unsortedValue = array[index];
            scan = index;
            
            while (scan > 0 && array[scan - 1] < unsortedValue) 
            {
                array[scan] = array[scan-1];
                scan--; 
            }
            array[scan] = unsortedValue;
        } 
    }
}
