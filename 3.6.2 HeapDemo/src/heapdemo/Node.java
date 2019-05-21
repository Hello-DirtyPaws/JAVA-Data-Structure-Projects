/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 6 #2.2
 */

package heapdemo;

public class Node 
{
    private int value, pos;
    private Node left, right;

    public Node() 
    {
        this(0,0);
    }
    
    public Node(int value) 
    {
        this(value, 0);
    }
    
    public Node(int value, int pos)
    {
        this.value = value;
        this.pos = pos;
        this.right = null;
        this.left = null;
    }
            
    public int getValue() 
    {
        return value;
    }

    public void setValue(int value) 
    {
        this.value = value;
    }

    public Node getLeft() 
    {
        return left;
    }

    public void setLeft(Node left)
    {
        this.left = left;
    }

    public Node getRight() 
    {
        return right;
    }

    public void setRight(Node right) 
    {
        this.right = right;
    }
    
    public int getPos()
    {
        return this.pos;
    }
    
    public void setPos(int pos)
    {
        this.pos = pos;
    }

    public String toString() 
    {
        return value + " ";
    }    
}

