package retaildemo; 
import javax.swing.JOptionPane;

public class WeekLab141RetailDemo 
{
    public static void main(String[] args) 
    {
        String title = "Retail Price Calculator";
        double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the retail price below:", 
                title, 1));
        
        double markUpPercent = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the markup percent below:", 
                title, 1));
        
        double retailPrice = price + (price * (markUpPercent / 100.0));
        String outMsg = "The retail price is: $" + retailPrice;
        
        JOptionPane.showMessageDialog(null, outMsg, title, 1);
    }

}
