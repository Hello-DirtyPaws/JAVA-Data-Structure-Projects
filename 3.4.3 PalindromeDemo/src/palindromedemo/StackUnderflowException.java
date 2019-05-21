/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #3.3
 */

package palindromedemo;

public class StackUnderflowException extends StackException
{

    public StackUnderflowException() 
    {
        this("The stack is full!!!");
    }

    public StackUnderflowException(String message)
    {
        super(message);
    }
    
}
