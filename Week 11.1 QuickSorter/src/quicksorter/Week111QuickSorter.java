package quicksorter;

public class Week111QuickSorter 
{

    public static void main(String[] args) 
    {
         // Create an int array with test values. 
        String[] values = {"F", "A", "C", "E", "B", "D"};
        
        // Display the array's contents.
        System.out.println("Original order:");
        for (String element : values) 
        {
            System.out.print(element + " ");
        }
        
        // Sort the array. 
        QuickSorterHelper.quickSort(values);
        
        // Display the array's contents. 
        System.out.println("\nSorted order:");
        for (String element : values) 
        {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
