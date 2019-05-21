/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #2.3
 */

package baseconverterdemo;

public interface ListStackADT <T>
{
    public abstract void inputPrompt();
    //Prompts the user to enter an integer and 
    //the base in which to convert the entered integer.
    
    public abstract void processAndPrint();
    //It takes the int and
    //1. Processes the integer to convert into its
    //respective base number.
    //2. Simultaneously, it also stores the converted number 
    //into a stack as a string.
    //3. It finally prints the output.
    
    public abstract String convertAll(long num);
    //Converts the long remainder(num) in String object. 
    
    public abstract void convert(String baseNum);
    //Converts and returns the BaseNumber in String format
    
    public abstract String toString();
    //Returns a String output in a detailed format.
    
}
