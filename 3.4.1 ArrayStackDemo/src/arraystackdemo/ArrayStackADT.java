/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #1.5
 */

package arraystackdemo;

public interface ArrayStackADT <T>
{
    public abstract void initializeStack();
    //Initialize the stack to null by default
           
    public abstract boolean isEmpty();
    //Returns true if the stack is empty 
    //or else returns false
           
    public abstract boolean isFull();
    //Returns true if the stack is full
    //or else false
            
    public abstract void push(T element) throws FullStackException;
    //Adds the element to the top of the stack 
    //And increases the size of the stack
    //It also thorws FullStackException if the stack is full
            
    public abstract void pop() throws EmptyStackException;
    //Removes the top element from the stack 
    //And decreases the size of the stack
    //It also thorws EmptyStackException if the stack is empty
             
    public abstract T peek() throws EmptyStackException;
    //Retrives the top element from the stack,
    //keeping it as it in the stack
    //It also thorws EmptyStackException if the stack is empty
            
}
