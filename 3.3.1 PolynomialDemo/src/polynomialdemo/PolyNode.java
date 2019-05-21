/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 3 #1.2
 */

package polynomialdemo;

public class PolyNode 
{
    private int coef, expo;
    private PolyNode next;
    

    public PolyNode() 
    {
        this.coef = 0;
        this.expo = 0;
        this.next = null;
    }

    public PolyNode(int coef, int expo)
    {
        this.coef = coef;
        this.expo = expo;
    }
    
    public PolyNode(PolyNode node) 
    {
        this.coef = node.coef;
        this.expo = node.expo;
        this.next = node.next;
    }

    public int getCoef() 
    {
        return coef;
    }

    public void setCoef(int coef) 
    {
        this.coef = coef;
    }

    public int getExpo() 
    {
        return expo;
    }

    public void setExpo(int expo) 
    {
        this.expo = expo;
    }

    public PolyNode getNext() 
    {
        return next;
    }

    public void setNext(PolyNode next) 
    {
        this.next = next;
    }

    public String toString() 
    {
        return Math.abs(this.coef) + "x^" + this.expo;
    }
    
   
}
