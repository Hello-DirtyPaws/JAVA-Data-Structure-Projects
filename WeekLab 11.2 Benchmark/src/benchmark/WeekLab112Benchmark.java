package benchmark; 

public class WeekLab112Benchmark 
{
    static int count = 0;
    
    public static void main(String[] args) 
    {
        int[] arry1 = {0,19,1,14,2,15,3,10,11,13,4,16,5,12,6,18,7,17,8,20,9};
        int[] arry2 = {0,19,1,14,2,15,3,10,11,13,4,16,5,12,6,18,7,17,8,20,9};
        int[] arry3 = {0,19,1,14,2,15,3,10,11,13,4,16,5,12,6,18,7,17,8,20,9};
        int[] arry4 = {0,19,1,14,2,15,3,10,11,13,4,16,5,12,6,18,7,17,8,20,9};
        
        System.out.println("Unsorted array: "); printArry(arry1);
        System.out.println("**************************************"
                         + "*************************************");
        
        bubbleSort(arry1);
        System.out.println("\nSorted array using bubble sort"); printArry(arry1);
        System.out.println("Total number of swaps using bubble sort are: " + count);
        
        insertionSort(arry2);
        System.out.println("\nSorted array using insertion sort"); printArry(arry2);
        System.out.println("Total number of swaps using insertion sort are: " + count);
        
        selectionSort(arry3);
        System.out.println("\nSorted array using selection sort"); printArry(arry3);
        System.out.println("Total number of swaps using selection sort are: " + count);
        
        quickSort(arry4);
        System.out.println("\nSorted array using quick sort"); printArry(arry4);
        System.out.println("Total number of swaps using quick sort are: " + count);
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
    
    public static void bubbleSort(int[] array) 
    {
        int lastPos;
        int index;
        int temp; 
        count = 0;
        
        for (lastPos = array.length - 1; lastPos >= 0; lastPos--) 
        {
            for (index = 0; index <= lastPos - 1; index++) 
            {
                if (array[index] > array[index + 1]) 
                {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    count++;
                }
            }
        }
    }
    
    public static void insertionSort(int[] array) 
    {
        int unsortedValue;  
        int scan; 
        count = 0;
        
        for (int index = 1; index < array.length; index++)
        {
            unsortedValue = array[index];
            scan = index;
            
            while (scan > 0 && array[scan - 1] > unsortedValue) 
            {
                array[scan] = array[scan-1];
                scan--; 
                count++;
            }
            array[scan] = unsortedValue;
        } 
    }
    
    public static void selectionSort(int[] array) 
    {
        int startScan;
        int index;
        int minIndex;
        int minValue;
        count = 0;

        for (startScan = 0; startScan < (array.length - 1); startScan++) 
        {
            minIndex = startScan;
            minValue = array[startScan];

            for (index = startScan + 1; index < array.length; index++) 
            {
                if (array[index] < minValue) 
                {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
            count++;
        }
    }
    
    public static void quickSort(int[] array) 
    {
        count = 0;
        doQuickSort(array, 0, array.length - 1);
    }

    private static void doQuickSort(int[] array, int start, int end) 
    {
        int pivotPoint;
        if (start < end) 
        {
            // Get the pivot point.
            pivotPoint = partition(array, start, end);
            // Sort the first sublist. 
            doQuickSort(array, start, pivotPoint - 1);
            // Sort the second sublist.
            doQuickSort(array, pivotPoint + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) 
    {
        int pivotValue; // To hold the pivot value
        int endOfLeftList; // Last element in the left sublist. 
        int mid; //To hold the mid-point subscript

        // Find the subscript of the middle element.
        // This will be our pivot value.
        mid = (start + end) / 2;
        
        // Swap the middle element with the first element.
        // This moves the pivot value to the start of
        // the list.
        swap(array, start, mid);
        
        // Save the pivot value for comparisons. 
        pivotValue = array[start];
        
        // For now, the end of the left sublist is 
        // the first element.
        endOfLeftList = start;
        
        // Scan the entire list and move any values that 
        // are less than the pivot value to the left
        // sublist.
        for (int scan = start + 1; scan <= end; scan++) 
        {
            if (array[scan] < pivotValue) 
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }
        
        // Move the pivot value to the end of the 
        // left sublist.
        swap(array, start, endOfLeftList);
        
        // Return the subscript of the pivot value.
        return endOfLeftList;
    }

    private static void swap(int[] array, int a, int b) 
    {
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        count++;
    }

}
