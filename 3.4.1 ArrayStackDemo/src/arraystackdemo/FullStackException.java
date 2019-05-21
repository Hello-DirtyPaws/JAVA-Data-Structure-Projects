/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #1.3
 */

package arraystackdemo;

public class FullStackException extends StackException
{

    public FullStackException() 
    {
        this("The stack is full!!!");
    }

    public FullStackException(String message)
    {
        super(message);
    }
    
}
