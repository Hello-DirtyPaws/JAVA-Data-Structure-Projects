/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #3.2
 */

package palindromedemo;

public interface LinkedStackADT <T>
{
    public abstract int getSize();
    //Returns the number of elements in the stack

    public abstract boolean isEmptyStack();
    //Returns true if the stack is empty
    //Else returns false

    public abstract void push(T data);
    //Adds the T data at the top of the stack 

    public abstract T peek();
    //Returns the top of the stack 
    //Keeping the stack contents unchanged

    public abstract T pop()throws StackUnderflowException;
    //Removes and returns the top element
    //of the stack
    //Throws a StackUnderflowException if tried
    //to remove or pop from an empty stack
}
