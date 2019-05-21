package salestaxdemo; 

import javax.swing.JOptionPane;

public class WeekLab142SalesTaxDemo 
{
    public static void main(String[] args) 
    {
        double stateTaxRate = 0.04, countyTaxRate = 0.02;
        
        String title = "Sales Tax Calculator";
        double salesPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the sales amount below:", 
                title, 1));
        
        double stateTax = salesPrice * stateTaxRate;
        double countyTax = salesPrice * countyTaxRate;
        
        String outMsg = "For sales of $" + salesPrice + 
                        "\nCounty Tax is: $" + countyTax + 
                        "\nState Tax is : $" + stateTax + 
                        "\nThe Total Tax is: $" + (countyTax + stateTax);
        
        JOptionPane.showMessageDialog(null, outMsg, title, 1);        
    }

}
