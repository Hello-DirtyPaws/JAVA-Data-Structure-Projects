/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #1.4
 */

package arraystackdemo;

public class EmptyStackException extends StackException
{

    public EmptyStackException() 
    {
        this("The stack is empty!!!");
    }
    
    public EmptyStackException(String message)
    {
        super(message);
    }
}
