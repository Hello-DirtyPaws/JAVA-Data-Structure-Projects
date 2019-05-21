
public class SnehalDemo 
{
    public static void main(String[] args) 
    {
        double miles = 40;
        
        
        double deliveryCost = 0;
        
        if(miles > 20)
        {
            deliveryCost = 0.75 * (miles - 20); 
        }
        
        Floor vinyl = new Floor(10, 10 ,"Wood", 3, 1.95, 2.05);
        System.out.println("QUOTE");
        System.out.println("No. len  wid   Area     Type   Flooring    Labor    Material   Total");
        System.out.println(vinyl);
        Floor wood = new Floor(5, 5, "Tile", 1.50, 1.25, 1.05);
        System.out.println(wood);
        
        
        double ttlCost = (vinyl.getFlooring()+ wood.getFlooring());
        double ttlIn = (vinyl.getLabor()+wood.getLabor());
        double ttlMat = (vinyl.getMaterial()+wood.getMaterial());
        double ttl1 = ttlCost+ttlIn+ttlMat;
        
        System.out.println("\nDelivery cost : " + deliveryCost);
        
        total = ttl1 + ttl1*.10;
        
        System.out.println("\n\nCost of flooring and  installation: " + (ttl1+deliveryCost));
        
        
    }

}
