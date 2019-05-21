/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #3.1
 */

package palindromedemo;

public class LinkedStack<T> implements LinkedStackADT<T>
{
    //Inner Class begins
    private class StackNode<T>
    {
        private T data;
        private StackNode next;

        public StackNode() 
        {
            this.data = null;
            this.next = null;
        }

        public StackNode(T data) 
        {
            this.data = data;
            this.next = null;
        }
        
        public String toString()
        {
            return ("" + this.data);
        }
    }//Inner class ends
    
    private StackNode top;
    private int size;

    public LinkedStack()
    {
        this.top = null;
        this.size = 0;
    }

    public LinkedStack(T data) 
    {
        //Creates a new stack with
        //just one element in it;
        this.top = new StackNode(data);
        this.size = 1;
    }
    
    public LinkedStack(LinkedStack stack)
    {
        this.top = stack.top;
        this.size = stack.size;
        //Shallow copy
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public boolean isEmptyStack()
    {
        return (this.size == 0);
    }
    
    public void push(T data)
    {
        this.size++;
        StackNode temp = new StackNode(data);
        temp.next = this.top;
        this.top = temp;
    }
    
    public T peek()
    {
        return (T)this.top.data;
    }
    
    public T pop() throws StackUnderflowException
    {
        if(isEmptyStack())
        {
            throw new StackUnderflowException("Cannot pop from an empty stack!!!");
        }
        this.size--;
        
        T temp = (T)this.top.data;
        this.top = this.top.next;
        
        return temp;
    }
}
