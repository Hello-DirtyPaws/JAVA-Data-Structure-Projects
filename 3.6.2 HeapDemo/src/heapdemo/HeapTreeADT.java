/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #2.3
 */

package heapdemo;

public interface HeapTreeADT 
{
    public abstract Node getRoot();
    //gives the root of the tree
    
    public abstract void setRoot(Node root);
    //used to set the root
    
    public abstract void insert(int value);
    //inserts the int value in accordance to Heap tree rules
    
    public abstract void remove();
    //removes the root from a non-empty heap
    
    public abstract void doPreOrder();
    //prints the tree in preorder
    
    public abstract void doInOrder();
    //prints the tree in inorder
    
    public abstract void doPostOrder();
    //prints the tree in postorder    
}
