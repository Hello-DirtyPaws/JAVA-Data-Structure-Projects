package morsecode; 

import java.util.Scanner;

public class Week93MorseCode 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = key.nextLine();
        System.out.println("The entered string in Morse code is: " + toMorseCode(str));
    }

    public static String toMorseCode(String str) 
    {
        String f = "";
        
        str = str.toUpperCase();
        
        for(int i = 0; i < str.length(); i++)
        {
            switch(str.charAt(i))
            {
                case ' ':
                    f += ' ';
                    break;
                case ',':
                    f += "--..--";
                    break;
                case '.':
                    f += ".-.-.-";
                    break;
                case '?':
                    f += "..--..";
                    break;
                case '0':
                    f += "-----";
                    break;
                case '1':
                    f += ".----";
                    break;
                case '2':
                    f += "..---";
                    break;
                case '3':
                    f += "...--";
                    break;
                case '4':
                    f += "....-";
                    break;
                case '5':
                    f += ".....";
                    break;
                case '6':
                    f += "-....";
                    break;
                case '7':
                    f += "--...";
                    break;
                case '8':
                    f += "---..";
                    break;
                case '9':
                    f += "----.";
                    break;
                case 'A':
                    f += ".-";
                    break;
                case 'B':
                    f += "-...";
                    break;
                case 'C':
                    f += "-.-.";
                    break;
                case 'D':
                    f += "-..";
                    break;
                case 'E':
                    f += ".";
                    break;
                case 'F':
                    f += "..-.";
                    break;
                case 'G':
                    f += "--.";
                    break;
                case 'H':
                    f += "....";
                    break;
                case 'I':
                    f += "..";
                    break;
                case 'J':
                    f += ".----";
                    break;
                case 'K':
                    f += "-.-";
                    break;
                case 'L':
                    f += ".-..";
                    break;
                case 'M':
                    f += "--";
                    break;
                case 'N':
                    f += "-.";
                    break;
                case 'O':
                    f += "---";
                    break;
                case 'P':
                    f += ".--.";
                    break;
                case 'Q':
                    f += "--.-";
                    break;
                case 'R':
                    f += ".-.";
                    break;
                case 'S':
                    f += "...";
                    break;
                case 'T':
                    f += "-";
                    break;
                case 'U':
                    f += "..-";
                    break;
                case 'V':
                    f += "...-";
                    break;
                case 'W':
                    f += ".--";
                    break;
                case 'X':
                    f += "-..-";
                    break;
                case 'Y':
                    f += "-.--";
                    break;
                case 'Z':
                    f += "--..";
                    break;
            }
        }
        
        return f;
    }

}
