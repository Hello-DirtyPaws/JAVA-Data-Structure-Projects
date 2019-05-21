package genericarray; 

public class Week12GenericArray 
{
    public static void main(String[] args)
 {
   Integer arr[] = {3,5,10,2,1,6};
   HighestLowestElements a = new HighestLowestElements((Comparable[]) arr);

   for(int i = 0; i < arr.length; i++)
   {
     System.out.print(arr[i] + " ");
   }
   System.out.println();
   System.out.println("The max element is: " + a.highest());

   System.out.println("The min element is: " + a.lowest());


 } 

}
