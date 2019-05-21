/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 5 #1.3
 */

package mccairportdemo;

public class ArryQueue <T>
{
    private T [] arryQ;
    private int size;
    private int count;
    private int QFront;
    private int QRear;

    public ArryQueue() 
    {
        this(100);
    }

    public ArryQueue(int size) 
    {
        this.size = size;
        this.arryQ = (T[]) new Object[this.size]; 
        this.count = 0;
        this.QFront = 0;
        this.QRear = this.size - 1;
    }
    
    public boolean isEmpty()
    {
        return count == 0;
    }
    
    public boolean isFull()
    {
        return this.count == this.size;
    }
    
    public int count()
    {
        return this.count;
    }
    
    public T peek()
    {
        if(isEmpty())
            return null;

        return (T)this.arryQ[this.QFront];
    }
    
    public void enqueue(T element)
    {
        if(!isFull())
        {
            this.count++;
            this.QRear = (this.QRear + 1) % this.size;
            this.arryQ[this.QRear] = element;
        }
        else
        {
            System.err.println("Queue is Full!! Cannot add \"" + element + "\".");
        }
    }
    
    public void dequeue()
    {
        if(!isEmpty())
        {
            this.count--;
            this.QFront = (this.QFront + 1) % this.size;
        }
        else
        {
            System.err.println("Queue is Empty!! Cannot remove."); 
        }
    }
}
