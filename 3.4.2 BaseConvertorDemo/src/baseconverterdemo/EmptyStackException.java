/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #2.5
 */

package baseconverterdemo;

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
