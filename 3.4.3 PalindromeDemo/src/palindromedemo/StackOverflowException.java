/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #3.4
 */

package palindromedemo;

public class StackOverflowException extends StackException
{

    public StackOverflowException() 
    {
        this("The stack is empty!!!");
    }
    
    public StackOverflowException(String message)
    {
        super(message);
    }
}
