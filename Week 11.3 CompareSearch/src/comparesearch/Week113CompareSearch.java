package comparesearch; 

import java.util.Scanner;

public class Week113CompareSearch 
{
    static int count = 0;
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        int[] arry = {0,19,1,14,2,15,3,10,11,13,4,16,5,12,6,18,7,17,8,20,9};
        System.out.println("Unsorted array: "); printArry(arry);
        System.out.println("**************************************"
                         + "*************************************");
        
        insertionSort(arry);
        System.out.println("Sorted array using insertion sort:"); printArry(arry);
        System.out.println("**************************************"
                         + "*************************************\n");
        
        
        System.out.print("Please enter a number to get its position: ");
        int userChoice = key.nextInt();
        
        System.out.println("The location found using the sequential search is"
                + "(position = -1 when the number does not exit): " + sequentialSearch(arry, userChoice));
        System.out.println("The number of comparisions made using the sequential search are: " + count);
        
        System.out.println();
        
        System.out.println("The location found using the binary search is"
                + "(position = -1 when the number does not exit): " + binarySearch(arry, userChoice));
        System.out.println("The number of comparisions made using the binary search are: " + count);
        
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
            
            while (scan > 0 && array[scan - 1] > unsortedValue) 
            {
                array[scan] = array[scan-1];
                scan--; 
            }
            array[scan] = unsortedValue;
        } 
    }
    
    public static int binarySearch(int[] array, int value) 
    {
        int first = 0;
        int last = array.length - 1;
        int middle;
        int position = -1;
        boolean found = false;
        count = 0;
        
        while (!found && first <= last) 
        {
            middle = (first + last) / 2;
            count++;
            if (array[middle] == value) 
            {
                found = true;
                position = middle;
            } else if (array[middle] > value) 
            {
                count++;
                last = middle - 1;
            } else 
            {
                //At this point the program has checked both the conditions of 
                //if as well as else if and failed.
                count = count + 2;
                first = middle + 1;
            }
        }
        return position;
    }

    public static int sequentialSearch(int[] array, int value) 
    {
        int index = 0;
        int element = -1;
        boolean found = false;
        count = 0;
        
        while (!found && index < array.length) 
        {
            count++;
            if (array[index] == value)
            {
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }
}

