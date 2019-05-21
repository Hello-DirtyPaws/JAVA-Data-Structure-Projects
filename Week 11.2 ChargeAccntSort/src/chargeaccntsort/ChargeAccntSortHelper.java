package chargeaccntsort;

public class ChargeAccntSortHelper 
{
        int[] array = {5658845, 4520125, 7895122, 8777541,
                             8080152, 4562555, 5552012, 5050552, 
                             1005231, 6545231, 3852085, 7576651,
                             8451277, 1302850, 7825877, 1250255, 
                             7881200, 4581002}; 
    
    public boolean exist(int userChoice)
    {
        return binarySearch(array, userChoice) >- 1;
    }
    
    public int binarySearch(int[] array, int value) 
    {
        int first = 0;
        int last = array.length - 1;
        int middle;
        int position = -1;
        boolean found = false;
        while (!found && first <= last) 
        {
            middle = (first + last) / 2;
            if (array[middle] == value) 
            {
                found = true;
                position = middle;
            } else if (array[middle] > value) 
            {
                last = middle - 1;
            } else 
            {
                first = middle + 1;
            }
        }
        return position;
    }

    public void selectionSort() 
    {
        int startScan;
        {
            int index;
            int minIndex = 0;
            int minValue;

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
            }
        }
    }
}
