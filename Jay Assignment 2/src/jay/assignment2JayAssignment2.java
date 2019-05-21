package jay; 

public class assignment2JayAssignment2 
{
    public static void main(String[] args) 
    {
        int[] arry1 = generateArry(10);
        int[] arry2 = generateArry(10);
        
        System.out.println("Unsorted array1: "); printArry(arry1);
        System.out.println("**************************************"
                         + "*************************************");
        
        System.out.println("Unsorted array2: "); printArry(arry2);
        System.out.println("**************************************"
                         + "*************************************");
        
        quickSort(arry1); quickSort(arry2);
        System.out.println("\nSorted array1 using quick sort"); printArry(arry1);
        System.out.println("**************************************"
                         + "*************************************");
        System.out.println("\nSorted array1 using quick sort"); printArry(arry2);
        System.out.println("**************************************"
                         + "*************************************");
        
        int [] arr = mergeArry(arry1, arry2);
        System.out.println("\nMerged and sorted array1 and array 2"); printArry(arr);
        System.out.println("**************************************"
                         + "*************************************");
        
    }
    
    public static int[] generateArry(int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) 
        {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
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
    
    public static int[] mergeArry(int[] arr1, int[] arr2)
    {
        int[] arr = new int[arr1.length+arr2.length];
        int i;
        for (i = 0; i < arr1.length; i++) 
        {
            arr[i] = arr1[i];
        }
        
        for (int j = 0; j < arr2.length; j++) 
        {
            arr[i++] = arr2[j];
        }
        
        quickSort(arr);
        return arr;
    }
    
    public static void quickSort(int[] array) 
    {
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
    }

}
