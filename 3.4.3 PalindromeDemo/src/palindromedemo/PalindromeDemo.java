/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #3
 */

package palindromedemo; 

import javax.swing.JOptionPane;

public class PalindromeDemo 
{
    public static void main(String[] args) 
    {
        String choice;
        do
        {
            String prompt = "Please enter a String to check "
                          + "if it is a palindrome(0 to quit): ";

            choice = JOptionPane.showInputDialog(null, prompt, "Palindrome", 1);

            //If the prompt was not cancelled.
            if (choice != null) 
            {
                String finalMSg = "The String \"" + choice + "\" is ";
                
                choice = choice.toUpperCase();
                choice = choice.replaceAll(" ", "");
                choice = choice.replaceAll("^", "");
                choice = choice.replaceAll("!", "");
                choice = choice.replaceAll("@", "");
                choice = choice.replaceAll("#", "");
                choice = choice.replaceAll("$", "");
                choice = choice.replaceAll("%", "");
                choice = choice.replaceAll("\'", "");
                choice = choice.replaceAll("&", "");
                choice = choice.replaceAll("-", "");
                choice = choice.replaceAll(",", "");
                choice = choice.replaceAll("/", "");

                if (!isPalindrome(choice)) 
                {
                    finalMSg += "NOT ";
                }

                finalMSg += "a palindrome.";

                JOptionPane.showMessageDialog(null, finalMSg, "Palindrome", 1);
            }

        } while (choice != null && !choice.equalsIgnoreCase("0"));
        System.exit(0);
    }
    
    public static boolean isPalindrome(String str)
    {
        LinkedStack<Character> myStack = new LinkedStack<>();
        
        for(int i = 0; i < str.length(); i++)
        {
            myStack.push(str.charAt(i));
        }
        
        for(int i = 0; i < str.length(); i++)
        {
            Character ch = (Character)str.charAt(i);
            
            try 
            {
                if(!ch.equals(myStack.pop()))
                    return false;
            } 
            catch (StackException ex) 
            {
                System.err.println(ex.getMessage());
            }
        }
        return true;
    }

}
