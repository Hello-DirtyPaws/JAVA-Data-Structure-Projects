package phonecompdemo;
import java.util.Scanner;

public class PhoneDetails 
{
    private String[] manuf;
    private String[] model;
    private double[] price;

    public PhoneDetails() 
    {
        this.manuf = new String[5];
        this.model = new String[5];
        this.price = new double[5];
    }
    
    public void add(String manuf, String model, double price , int index)
    {
        this.manuf[index] = manuf;
        this.model[index] = model;
        this.price[index] = price;
    }
    
    public void readNAdd(Scanner read) 
    {
        int index = 0;
        while(read.hasNext())
        {
            this.add(read.next(), read.next(), read.nextDouble(), index++);
        }
        
        read.close();
    }
    
    public void sortByManuf()
    {
        String tempManuf = this.manuf[0];
        String tempModel = this.manuf[0];
        double tempPrice = this.price[0];
        int lowestIndex = 0;
        
        
        for(int i = 0; i < this.manuf.length; i++)
        {
            for(int j = i; j < this.manuf.length; j++)
            {
                if(tempManuf.compareTo(manuf[j]) > 0)
                {
                    tempManuf = this.manuf[j];
                    tempModel = this.model[j];
                    tempPrice = this.price[j];
                    lowestIndex = j;
                }
            }
            this.manuf[lowestIndex] = this.manuf[i];
            this.model[lowestIndex] = this.model[i];
            this.price[lowestIndex] = this.price[i];
            
            this.manuf[i] = tempManuf;
            this.model[i] = tempModel;
            this.price[i] = tempPrice;
            
            lowestIndex = i + 1;
            
            if(i < this.manuf.length-1)
            {
                tempManuf = this.manuf[i+1];
                tempModel = this.model[i+1];
                tempPrice = this.price[i+1];
            }
                
        }
        
        
    }

    public void sortByPrice()
    {
        String tempManuf = this.manuf[0];
        String tempModel = this.model[0];
        double tempPrice = this.price[0];
        int lowestIndex = 0;
        
        
        for(int i = 0; i < this.price.length; i++)
        {
            for(int j = i; j < this.price.length; j++)
            {
                if(tempPrice > price[j])
                {
                    tempManuf = this.manuf[j];
                    tempModel = this.model[j];
                    tempPrice = this.price[j];
                    lowestIndex = j;
                }
            }
            this.manuf[lowestIndex] = this.manuf[i];
            this.model[lowestIndex] = this.model[i];
            this.price[lowestIndex] = this.price[i];
            
            this.manuf[i] = tempManuf;
            this.model[i] = tempModel;
            this.price[i] = tempPrice;
            
            lowestIndex = i + 1;
            
            if(i < this.price.length-1)
            {
                tempManuf = this.manuf[i+1];
                tempModel = this.model[i+1];
                tempPrice = this.price[i+1];
            }
        }

    }
    
    public double search(String model)
    {
        double price = 0.00;        
        
        for(int i = 0; i < this.price.length; i++)
        {
            if(this.model[i].equalsIgnoreCase(model))
            {
                price = this.price[i];
            }
        }
        return price;
    }
    
    @Override
    public String toString() 
    {
        String out = "";
        
        for (int i = 0; i < this.manuf.length; i++) 
        {
            out += this.manuf[i] + " " + this.model[i] + " $" + this.price[i] + "\n";
        }
        
        return out;
    }
    
    
}
