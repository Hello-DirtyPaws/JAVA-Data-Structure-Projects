/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #1.2
 */

package bstdemo;

public class BinaryCompleteTree 
{
    private Node root;
    private int lastPos;
    private int numOfSingleParent;
    
    public BinaryCompleteTree() 
    {
        this.root = null;
        this.lastPos = -1;
    }

    public BinaryCompleteTree(int value) 
    {
        this.root = new Node(value);
        this.lastPos = 0;
    }

    public Node getRoot() 
    {
        return root;
    }

    public void setRoot(Node root) 
    {
        this.root = root;
    }
    
    public int getLastPos()
    {
        return this.lastPos;
    }
    
    public void setLastPos(int lastPos)
    {
        this.lastPos = lastPos;
    }
    
    public int getNumOfSingleParent()
    {
        this.numOfSingleParent = 0;
        singleParent(this.root);
        return this.numOfSingleParent;
    }
    
    public Node find(int pos) 
    {
        if(pos < 0)
            return null;
        else if(pos == 0)
            return this.root;
        else
        {
            Node curr = this.root;
            pos++;
            
            while(pos > 1)
            {
                if(pos % 2 == 0)
                    curr = curr.getLeft();
                else
                    curr = curr.getRight();
                
                pos = pos / 2;
            }
            
            return curr;
        }//else pos > 0 ends
    }
    
    public void insert(int value)
    {
        Node temp = new Node(value, lastPos + 1);
        if(this.root == null)
        {
            this.root = temp;
        }
        else
        {
            if(lastPos % 2 == 0)                
                find(lastPos / 2).setLeft(temp);
            else
                find(lastPos / 2).setRight(temp);
        }//else root != null, ends
        
        lastPos++;
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
