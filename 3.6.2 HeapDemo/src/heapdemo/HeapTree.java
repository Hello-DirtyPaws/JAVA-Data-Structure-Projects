/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #2.1
 */

package heapdemo;

public class HeapTree implements HeapTreeADT
{
    private Node root;
    private int lastPos;
    
    public HeapTree() 
    {
        this.root = null;
        this.lastPos = -1;
    }

    public HeapTree(int value) 
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
            int i = -1;
            int [] storeDir = new int[10];
            
            while(pos > 1)
            {
                if(pos % 2 == 0)
                    storeDir[++i] = 0;
                else
                    storeDir[++i] = 1;
                
                pos = pos / 2;
            }
            
            while(i >= 0)
            {
                if(storeDir[i] == 0)
                    curr = curr.getLeft();
                else
                    curr = curr.getRight();
                
                i--;
                
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
        
        swapInsert(temp);
        lastPos++;
    }

    private void swapInsert(Node curr) 
    {
        if(curr != null)
        {
            Node parent = find((curr.getPos() - 1) / 2);
            
            //if the value inside the curr node is greater than its parent
            //then, the values of the parent and the curr will interchange.
            if(curr.getValue() > parent.getValue())
            {
                int temp = curr.getValue();
                curr.setValue(parent.getValue());
                parent.setValue(temp);
                swapInsert(parent);
            }
        }
    }
    
    public void remove()
    {
        if(this.lastPos > 0)
        {
            //parent of the last node entered
            Node lastParent = find((lastPos - 1) / 2);
            
            //sets the last node's value into the root's value
            //and setting the parent's pointer 
            //pointing to the last node to null
            if(lastPos % 2 == 0)
            {
                //if the last node was a right child
                this.root.setValue(lastParent.getRight().getValue());
                lastParent.setRight(null);
            }
            else
            {
                //if the last node was a left child
                this.root.setValue(lastParent.getLeft().getValue());
                lastParent.setLeft(null);
            }
            swapRemove(this.root);
        }
        else
        {   //if the lastPos == 0, or the tree has just the root node
            this.root = null;
        }
        this.lastPos--;
    }

    private void swapRemove(Node curr) 
    {
        //if the left node is null, 
        //curr doesn't have even the right child
        if(curr.getLeft() != null)
        {
            Node left = curr.getLeft();
            if(curr.getRight() != null)
            {
                Node right = curr.getRight();
                
                //if the left has the largest value
                if(left.getValue() > right.getValue() 
                                  && 
                   left.getValue() > curr.getValue())
                {
                    //swap the values and 
                    //recurse using the left as a new parent/root
                    int temp = curr.getValue();
                    curr.setValue(left.getValue());
                    left.setValue(temp);
                    swapRemove(left);
                }
                
                //if the right has the largest value
                else if(right.getValue() > left.getValue() 
                                      && 
                        right.getValue() > curr.getValue())
                {
                    //swap the values and 
                    //recurse using the right as a new parent/root
                    int temp = curr.getValue();
                    curr.setValue(right.getValue());
                    right.setValue(temp);
                    swapRemove(right);
                }
            }//if(right != null), ends
            
            //else if(..), right == null but left != null
            else if(left.getValue() > curr.getValue())
            {
                //swap left's and curr(parent)'s value
                int temp = curr.getValue();
                curr.setValue(left.getValue());
                left.setValue(temp);
            }
        }//if(left != null), ends
        //if(left == null), no need for swapping
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
