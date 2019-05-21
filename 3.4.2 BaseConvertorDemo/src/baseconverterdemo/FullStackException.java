/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #2.6
 */

package baseconverterdemo;

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
