package genericarray;

public class HighestLowestElements <T extends Comparable<T>>
{
 private T[] arr;
 public HighestLowestElements()
 {
   this.arr = (T[]) new Comparable[10];
 }
 public HighestLowestElements(int size)
 {
   this.arr = (T[]) new Comparable[size];
 }
 public HighestLowestElements(T arr[])
 {
     this.arr = (T[])new Comparable[arr.length];
   for(int i = 0; i < arr.length ; i++)
   {
     this.arr[i] = arr[i];
   }
 }
 public T[] getArr()
 {
   return this.arr;
 }

 public T highest()
 {
   T max = arr[0];
   for( int i=0; i < arr.length; i++)
   {
     if(max.compareTo(arr[i])<0)
     {
       max = arr[i];
     }
   }
   return max;
 }
 public T lowest()
 {
   T min = arr[0];
   for( int i=0; i < arr.length; i++)
   {
     if(min.compareTo(arr[i]) > 0)
     {
       min = arr[i];
     }
   }
   return min;
 }
}