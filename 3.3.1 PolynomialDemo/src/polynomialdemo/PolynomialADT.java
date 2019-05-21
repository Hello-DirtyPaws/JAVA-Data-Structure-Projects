/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 3 #1.3
 */

package polynomialdemo;

public interface PolynomialADT 
{
    public abstract PolyNode getFirstNode();
    //Returns the first node of the polunomial obj called upon
    
    public abstract void setFirstNode(PolyNode firstNode);
    //Sets this.firstNode pointer to firstNode in the argument
    //rather than just changing the values in this.firstNode
            
    public abstract boolean isEmpty();  
    //Returns true if the current polynomial is empty 
    //else false
    
    public abstract void addPolyNodeFirst(int coef, int expo); 
    //Adds a new polyNode with the given coeficient (int coef) 
    //and the given exponent (int expo) at the begining of the polynomial
            
    public abstract void addPolyNodeLast(int coef, int expo);
    //Adds a new polyNode with the given coeficient (int coef) 
    //and the given exponent (int expo) at the end of the polynomial        
    public abstract void addPolyNode(int coef, int expo);
    //Calls the method addPolyNodeLast as default adding polyNodes
    
    public abstract Polynomial addPolynomials(Polynomial p1, Polynomial p2);  
    //Algebrically adds two polynomials p1 and p2
    //and returns a brand new Polynomial object (set) 
    //representing the addition of p1 and p2
    
    public abstract String toString();
    //Gives the string output of the current polynomial list
}
