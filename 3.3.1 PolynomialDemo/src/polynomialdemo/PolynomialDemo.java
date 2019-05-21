/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 3 #1
 */

package polynomialdemo; 

public class PolynomialDemo 
{
    public static void main(String[] args) 
    {
        Polynomial p1 = new Polynomial();
        p1.addPolyNodeLast(4, 3);
        p1.addPolyNodeLast(3, 2);
        p1.addPolyNodeLast(-5, 0);
        
        Polynomial p2 = new Polynomial();
        p2.addPolyNodeLast(3, 5);
        p2.addPolyNodeLast(4, 4);
        p2.addPolyNodeLast(1, 3);
        p2.addPolyNodeLast(-4, 2);
        p2.addPolyNodeLast(4, 1);
        p2.addPolyNodeLast(2, 0);
        
        Polynomial p3 = new Polynomial();
        p3.addPolyNodeLast(-5, 0);
        p3.addPolyNodeLast(3, 2);
        p3.addPolyNodeLast(4, 3);
        
        Polynomial p4 = new Polynomial();
        p4.addPolyNodeLast(-4, 0);
        p4.addPolyNodeLast(4, 3);
        p4.addPolyNodeLast(5, 4);
        
        System.out.println(" p1:  " + p1);
        System.out.println(" p2:  " + p2);
        System.out.println(" p3:  " + p3);
        System.out.println(" p4:  " + p4);
        System.out.println("-----------------------"
                         + "-----------------------");
        
        Polynomial p1_p2 = p1.addPolynomials(p1, p2);
        Polynomial p3_p4 = p3.addPolynomials(p3, p4);
        Polynomial p2_p4 = p2.addPolynomials(p2, p4);
        
        p1_p2.arrangeInDescending();
        p3_p4.arrangeInDescending();
        p2_p4.arrangeInDescending();
        
        System.out.println("p1 + p2:" + p1_p2);
        System.out.println("p3 + p4:" + p3_p4);
        System.out.println("p2 + p4:" + p2_p4);
        
        
    }

}
