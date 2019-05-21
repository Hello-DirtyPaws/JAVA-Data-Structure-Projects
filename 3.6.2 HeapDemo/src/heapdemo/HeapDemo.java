/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #2
 */

package heapdemo; 

public class HeapDemo 
{
    public static void main(String[] args) 
    {
        HeapTree tree1 = new HeapTree();
        
        System.out.println("\t\tADDING 1-10 INTO A HEAP\n"
                         + "---------------------------------"
                         + "----------------------------");
        
        for (int i = 1; i < 11; i++) 
        {
            tree1.insert(i);
        }
        System.out.print("Inorder traversal: ");
        tree1.doInOrder();
        
        System.out.print("\nPostorder traversal: ");
        tree1.doPostOrder();
        
        System.out.print("\nPreorder traversal: ");
        tree1.doPreOrder();
        System.out.println("\n*******************************"
                         + "*******************************");
        
        tree1.remove(); tree1.remove(); tree1.remove();
        
        System.out.println("\n\t\tREMOVING 3 ITEMS FROM THE HEAP\n"
                         + "---------------------------------"
                         + "----------------------------");
        
        System.out.print("Inorder traversal: ");
        tree1.doInOrder();
        
        System.out.print("\nPostorder traversal: ");
        tree1.doPostOrder();
        
        System.out.print("\nPreorder traversal: ");
        tree1.doPreOrder();
        System.out.println("\n*******************************"
                         + "*******************************");   
    }

}
