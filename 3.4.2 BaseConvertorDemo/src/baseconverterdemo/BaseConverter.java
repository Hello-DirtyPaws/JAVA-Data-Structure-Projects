/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 4 #2.1
 */

package baseconverterdemo;

import java.util.Scanner;

public class BaseConverter implements ListStackADT
{

    private class BaseNumber 
    {
        private long num;
        private long base;

        public BaseNumber() 
        {
            this.num = 0;
            this.base = 10;
        }

        public BaseNumber(long num, long base) 
        {
            this.num = num;
            this.base = base;
        }

        public long getNum() 
        {
            return num;
        }

        public void setNum(long num) 
        {
            this.num = num;
        }

        public long getBase() 
        {
            return base;
        }

        public void setBase(long base) 
        {
            this.base = base;
        }
    }//Inner class BaseNumber ends
    
    private BaseNumber baseNumObj;
    private String baseNumString;
    private Scanner key = new Scanner(System.in);
    private ListStack<String> myStack;

    public BaseConverter() 
    {
        baseNumObj = null;
        baseNumString = "";
    }
    
    public void inputPrompt()
    {
            System.out.print("Enter a base 10 integer number "
                           + "you want to convert: ");
            long num = key.nextLong();

            System.out.print("Enter the conversion "
                           + "base number(2-9): ");
            long base = key.nextLong();

            baseNumObj = new BaseNumber(num, base);      
    }
    
    public void processAndPrint()
    {
        char choice;
        do
        {
            inputPrompt();
            
            myStack = new ListStack<>(); 
            
            long num = baseNumObj.getNum();
            while(num != 0)
            {
                //1. Caculate the remainder.
                //2. Convert it to String using "convertAll" method.
                //3. Push the converted String to the stack.
                myStack.push(convertAll(num % baseNumObj.getBase()));
                
                //Updates the base number.
                num = num / baseNumObj.getBase(); 
            }
            
            //Doing the printing.
            System.out.println(this.toString());
            
            //Asking the user if he wants to convert more numbers.
            System.out.print("\nEnter 'Y' to continue; "
                           + "anything else to quit: ");
            choice = key.next().charAt(0);
            System.out.println("--------------------------"
                             + "--------------------------");

        } while (choice == 'Y' || choice == 'y');
    }
    
    public String convertAll(long num)
    {
        return new String(num + "");
    }
    
    public void convert(String baseNum)
    {
        baseNumString += baseNum;
    }
    
    public String toString()
    {
        String s = baseNumObj.getNum() + "(Base 10) = ";
        
        for (int i = myStack.getSize() - 1; i > -1; i--) 
        {
            convert(myStack.peek());
            s += myStack.pop() + " * " + 
                 baseNumObj.getBase() + "^" + i + " + ";
        }
        
        //Removes the extra "+ " String.
        s = s.substring(0, s.length() - 2);
        s += "= " + baseNumString + 
             "(Base " + baseNumObj.getBase() + ")";
        
        baseNumString = "";
        
        return s;
    }

}
