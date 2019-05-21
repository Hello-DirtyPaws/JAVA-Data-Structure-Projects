/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #2.2
 */

package baseconverterdemo;

public class ListStack <T>
{
    private class StackNode <T>
    {
        private T value;
        private StackNode next;

        public StackNode() 
        {
            this.value = null;
            this.next = null;
        }

        public StackNode(T value) 
        {
            this.value = value;
        }
        
        public StackNode(StackNode node)
        {
            this.value = (T) node.getValue();
            this.next = node.getNext();
        }
        
        public T getValue()
        {
            return value;
        }

        public void setValue(T value) 
        {
            this.value = value;
        }

        public StackNode getNext() 
        {
            return next;
        }

        public void setLink(StackNode next) 
        {
            this.next = next;
        }        
    }//inner class StackNode<T> ends
    
    private StackNode<T> top;
    private int size;

    public ListStack() 
    {
        this.top = new StackNode();
        this.size = 0;
        //top.value = null 
        //top.next = null
    }
    
    public ListStack(T value)
    {
        this.top = new StackNode(value);
        this.size = 0;
    }
    
    public ListStack(ListStack stackObj)
    {
        this.top = stackObj.getTop();
        this.size = stackObj.size;
        //Shallow copy
    }

    public StackNode<T> getTop() 
    {
        return top;
    }
    
    public void setTop(StackNode node)
    {
        this.top = node;
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public T peek()
    {
        return this.getTop().getValue();
    }
    
    public boolean isEmpty()
    {
        return this.top == null;
    }
    
    public void ifEmpty()
    {
        try
        {
            throw new EmptyStackException();
        }
        catch(EmptyStackException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void push(T value)
    {
        StackNode node = new StackNode(value);
        node.setLink(this.top);
        this.top = node;
        this.size++;
    }
    
    public T pop()
    {
        T value = null;
        if(isEmpty())
        {
            ifEmpty();
        }
        else
        {
            this.size--;
            value = this.top.getValue();
            this.setTop(this.top.getNext()); 
        }
        return value;
    }
    
    //Gives out the collection notation String of the stack.
    public String toString()
    {
        String s = "[ ";
        
        ListStack<T> reversedStack = new ListStack<>();
        
        while(!this.isEmpty())
        {
            s += this.peek() + " ";
            
            //Not loosing the elements.
            reversedStack.push(this.pop());
        }
        
        while(!reversedStack.isEmpty())
        {
            //Restoring the elements back in the currrent stack.
            this.push(reversedStack.pop());
        }
        
        s += "]";
        
        return s;
    }
}
