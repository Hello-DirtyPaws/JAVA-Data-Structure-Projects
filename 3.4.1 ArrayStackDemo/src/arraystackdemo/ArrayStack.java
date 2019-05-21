package arraystackdemo;

/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #1.1
 */


public class ArrayStack <T> implements ArrayStackADT <T>
{
    private T [] stack;
    private int size, capacity;

    public ArrayStack() 
    {
        this(50);
    }
    
    public ArrayStack(int capacity)
    {
        this.size = 0;
        this.capacity = capacity;
        this.stack = (T [])new Object[capacity];
        this.initializeStack();
    }
    
    public ArrayStack(ArrayStack obj) 
    {
        //Creating a similar capacity array.
        this(obj.capacity);
        
        //Equalising the # of elements in 
        //both the stacks or arrays.
        this.size = obj.size;
        
        //Creating a deep copy.
        for(int i = 0; i < this.size; i++)
            this.stack[i] = (T)obj.stack[i];
    }
    
    public void initializeStack()
    {
        //Initialize to null.
        for(int i = 0; i < stack.length; i++)
            this.stack[i] = null;
    }
    
    public boolean isEmpty()
    {
        return (this.size == 0);
    }
    
    public boolean isFull()
    {
        return (this.size == this.capacity);
    }
    
    public void push(T element) throws FullStackException
    {
        if(!isFull())
        {
            this.stack[this.size++] = element;
        }
        else
        {
            throw new FullStackException();
        }
    }
    
    public void pop() throws EmptyStackException
    {
        if(!isEmpty())
        {
            this.stack[--this.size] = null;
        }
        else
        {
            throw new EmptyStackException();
        }
    }
    
    public T peek() throws EmptyStackException
    {
        if(!isEmpty())
        {
            return this.stack[this.size-1];
        }
        else
        {
            throw new EmptyStackException();
        }
    }
}
