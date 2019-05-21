/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 5 #1.4
 */

package mccairportdemo;

public interface ArryQueueADT<T>
{
    public abstract boolean isEmpty();
    //returns true if the queue is empty
    //else false
    
    public abstract boolean isFull();
    //returns true if the queue is full
    //else returns false

    public abstract int count();
    //returns the number of elements in the queue

    public abstract T peek();
    //returns the first element in the queue
    //without making any changes to the queue

    public abstract void enqueue(T element);
    //adds the element in the queue if the queue is not full

    public abstract void dequeue();
    //removes the first element the queue if the queue is not empty
}
