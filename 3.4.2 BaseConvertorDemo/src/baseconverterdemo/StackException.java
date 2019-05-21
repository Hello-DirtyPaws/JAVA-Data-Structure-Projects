/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #2.4
 */

package baseconverterdemo;

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
