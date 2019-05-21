/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #1.3
 */

package bstdemo;

public class BSTree implements BSTreeADT
{
    private Node root;
    private int numOfSingleParent;

    public BSTree() 
    {
        this.root = null;
        this.numOfSingleParent = 0;
    }

    public BSTree(int value) 
    {
        this.root = new Node(value);
        this.numOfSingleParent = 0;
    }

    public Node getRoot() 
    {
        return root;
    }

    public void setRoot(Node root) 
    {
        this.root = root;
    }
    
    public int getNumOfSingleParent()
    {
        this.numOfSingleParent = 0;
        singleParent(this.root);
        return this.numOfSingleParent;
    }
    
    public void insert(int value)
    {
        Node x = new Node(value);

        if (this.root == null) 
        {
            this.root = x;
        } 
        else 
        {
            Node curr = this.root;
            Node prev = curr;

            while (curr != null) 
            {
                prev = curr;
                if (value < curr.getValue()) 
                {
                    curr = curr.getLeft();
                } 
                else 
                {
                    curr = curr.getRight();
                }
            }
            if (value < prev.getValue()) 
            {
                prev.setLeft(x);
            } 
            else 
            {
                prev.setRight(x);
            }
        }
        
    }
    
    public void doSwap()
    {
        swap(this.root);
    }
    
    private void swap(Node curr)
    {
        if(curr.getLeft() != null)
        {
            swap(curr.getLeft());
        }
        if(curr.getRight() != null)
        {
            swap(curr.getRight());
        }
        
        if(curr.getLeft() != null || curr.getLeft() != null)
        {
            Node temp = curr.getLeft();
            curr.setLeft(curr.getRight());
            curr.setRight(temp);
        }
    }
    
    private void singleParent(Node curr)
    {
        if(curr.getLeft() != null)
        {
            singleParent(curr.getLeft());
        }
        if(curr.getRight() != null)
        {
            singleParent(curr.getRight());
        }
        if((curr.getRight() != null && curr.getLeft() == null) || 
           (curr.getRight() == null && curr.getLeft() != null))
        {
            this.numOfSingleParent++;
        }
    }
    
    public void doPreOrder()
    {
        preOrder(this.root);
    }
    
    private void preOrder(Node curr)
    {
        if(curr != null)
        {
            System.out.print(curr);
            preOrder(curr.getLeft());
            preOrder(curr.getRight());
        }
    }

    public void doInOrder()
    {
        inOrder(this.root);
    }
    
    private void inOrder(Node curr)
    {
        if(curr != null)
        {
            inOrder(curr.getLeft());
            System.out.print(curr);
            inOrder(curr.getRight());
        }
    }
    
    public void doPostOrder()
    {
        postOrder(this.root);
    }
    
    private void postOrder(Node curr)
    {
        if(curr != null)
        {
            postOrder(curr.getLeft());
            postOrder(curr.getRight());
            System.out.print(curr);
        }
    }
    
}

