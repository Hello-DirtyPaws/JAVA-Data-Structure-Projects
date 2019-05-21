/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #3.5
 */

package palindromedemo;

public class StackException extends Exception
{

    public StackException() 
    {
        this("There is an error in the stack!!!");
    }

    public StackException(String message) 
    {
        super(message);
    }
    
    
}
