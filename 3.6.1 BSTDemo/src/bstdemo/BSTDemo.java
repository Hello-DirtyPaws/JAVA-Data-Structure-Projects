/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #1s
 */

package bstdemo; 

public class BSTDemo 
{
    public static void main(String[] args) 
    {
        //Tree 1 -- Binary Complete Tree
        BinaryCompleteTree compTreeObj = new BinaryCompleteTree();
        
        for(int i = 1; i < 7; i++)
        {
            compTreeObj.insert(i);
        }
        
        System.out.println("---------------------------------"
                         + "-----------------------------");
        System.out.println("\t\tA regular Binary Tree");
        System.out.println("---------------------------------"
                         + "-----------------------------");
        
        System.out.print("Inorder traversal: ");
        compTreeObj.doInOrder();
        
        System.out.print("\nPostorder traversal: ");
        compTreeObj.doPostOrder();
        
        System.out.print("\nPreorder traversal: ");
        compTreeObj.doPreOrder();
        System.out.println("\n*******************************"
                         + "*******************************");
        
        System.out.println("\n---------------------------------"
                         + "-----------------------------");
        compTreeObj.doSwap();
        System.out.println("\t\tAfter Swapping...");
        System.out.println("---------------------------------"
                         + "-----------------------------");
        
        System.out.print("Inorder traversal: ");
        compTreeObj.doInOrder();
        
        System.out.print("\nPostorder traversal: ");
        compTreeObj.doPostOrder();
        
        System.out.print("\nPreorder traversal: ");
        compTreeObj.doPreOrder();
        System.out.println("\n*******************************"
                         + "*******************************");
        System.out.println("\nThe total number of single parent/s is/are: "
                         + compTreeObj.getNumOfSingleParent());
        System.out.println("\n---------------------------------"
                         + "-----------------------------");
        
        
        //Tree 2 -- Binary Search Tree
        BSTree bSTreeObj = new BSTree();
        
        bSTreeObj.insert(14);
        bSTreeObj.insert(15);
        bSTreeObj.insert(4);
        bSTreeObj.insert(3);
        bSTreeObj.insert(9);
        bSTreeObj.insert(7);
        bSTreeObj.insert(5);
        bSTreeObj.insert(18);
        bSTreeObj.insert(16);
        bSTreeObj.insert(20);
        bSTreeObj.insert(17);
        
        System.out.println("\t\tA regular Binary Search Tree");
        System.out.println("---------------------------------"
                         + "-----------------------------");
        
        System.out.print("Inorder traversal: ");
        bSTreeObj.doInOrder();
        
        System.out.print("\nPostorder traversal: ");
        bSTreeObj.doPostOrder();
        
        System.out.print("\nPreorder traversal: ");
        bSTreeObj.doPreOrder();
        System.out.println("\n*******************************"
                         + "*******************************");
        
        bSTreeObj.doSwap();
        System.out.println("\n---------------------------------"
                         + "-----------------------------");
        System.out.println("\t\tAfter Swapping..\n");
        System.out.println("---------------------------------"
                         + "-----------------------------");
        
        System.out.print("Inorder traversal: ");
        bSTreeObj.doInOrder();
        
        System.out.print("\nPostorder traversal: ");
        bSTreeObj.doPostOrder();
        
        System.out.print("\nPreorder traversal: ");
        bSTreeObj.doPreOrder();
        System.out.println("\n*******************************"
                         + "*******************************");
        System.out.println("\nThe total number of single parent/s is/are: "
                         + bSTreeObj.getNumOfSingleParent());
        System.out.println("---------------------------------"
                         + "-----------------------------");
        
    }

}
