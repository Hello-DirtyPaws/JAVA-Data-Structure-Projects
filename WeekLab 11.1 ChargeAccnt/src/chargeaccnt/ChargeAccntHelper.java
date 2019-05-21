package chargeaccnt;

public class ChargeAccntHelper 
{
        int[] chargeAccts = {5658845, 4520125, 7895122, 8777541,
                             8080152, 4562555, 5552012, 5050552, 
                             1005231, 6545231, 3852085, 7576651,
                             8451277, 1302850, 7825877, 1250255, 
                             7881200, 4581002}; 

    public ChargeAccntHelper()
    {
        //does nothing.
    }   
    
    public boolean exist(int userChoice)
    {
        for(int i = 0; i < this.chargeAccts.length; i++)
        {
            if(this.chargeAccts[i] == userChoice)
                return true;
        }
        return false;
    }
}
