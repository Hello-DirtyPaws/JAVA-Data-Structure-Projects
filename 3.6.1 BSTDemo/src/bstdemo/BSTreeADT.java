/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #1.4
 */

package bstdemo;

public interface BSTreeADT 
{
    public abstract Node getRoot();
    //gives the root of the tree
    
    public abstract void setRoot(Node root);
    //used to set the root
    
    public abstract int getNumOfSingleParent();
    //Returns the number of single parents in the tree
    
    public abstract void insert(int value);
    //inserts the int value in accordance to BST rules
    
    public abstract void doSwap();
    //initialize swapping
    
    public abstract void doPreOrder();
    //prints the tree in preorder
    
    public abstract void doInOrder();
    //prints the tree in inorder
    
    public abstract void doPostOrder();
    //prints the tree in postorder
    
}
