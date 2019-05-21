package namesearch; 

import java.io.*;
import java.util.Scanner;

public class WeekLab111NameSearch 
{
    public static String [] names = new String[65];
    public static void main(String[] args) throws FileNotFoundException 
    {
        readInArray();  
        quickSort(names);
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the name you want to search: "); String s = kb.next().toUpperCase();
        System.out.println("Seraching "+ s +". It is at location: " + binarySearch(names, s));
    }
    
    public static void readInArray() throws FileNotFoundException
    {
        Scanner read = new Scanner(new FileReader("names.txt"));
        
        for(int i = 0; i < names.length; i++)
        {
            names[i] = read.next().toUpperCase();
        }
        read.close();        
    }
    
    public static int binarySearch(String[] array, String value) 
    {
        int first = 0;
        int last = array.length - 1;
        int middle;
        int position = -1;
        boolean found = false;
        
        while (!found && first <= last) 
        {
            middle = (first + last) / 2;
            if (array[middle].equals(value)) 
            {
                found = true;
                position = middle;
            } else if (array[middle].compareTo(value) > 0) 
            {
                last = middle - 1;
            } else 
            {
                first = middle + 1;
            }
        }
        return position;
    }
    
    
    public static void quickSort(String[] array) 
    {
        doQuickSort(array, 0, array.length - 1);
    }

    private static void doQuickSort(String[] array, int start, int end) 
    {
        int pivotPoint;
        if (start < end) 
        {
            pivotPoint = partition(array, start, end);
            doQuickSort(array, start, pivotPoint - 1);
            doQuickSort(array, pivotPoint + 1, end);
        }
    }

    private static int partition(String[] array, int start, int end) 
    {
        String pivotValue; 
        int endOfLeftList; 
        int mid = (start + end) / 2;
        
        swap(array, start, mid);
        
        pivotValue = array[start];
        
        endOfLeftList = start;
      
        for (int scan = start + 1; scan <= end; scan++) 
        {
            if (array[scan].compareTo(pivotValue) < 0) 
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }        
        swap(array, start, endOfLeftList);
        
        return endOfLeftList;
    }

    private static void swap(String[] array, int a, int b) 
    {
        String temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
