/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 2 #2
 */

package note; 

public class NoteDemo 
{
    public static void main(String[] args) 
    {
        Note n1 = new Note();
        System.out.println("Note 1: ");
        System.out.println(n1);
        System.out.println("----------------------");
        
        Note n2 = new Note();
        System.out.println("Note 2: ");
        System.out.println(n2);
        System.out.println("----------------------");
        
        Note n3 = new Note(-3, "Eighth note");
        System.out.println("Note 3: ");
        System.out.println(n3);
        System.out.println("----------------------");
        
        Note n4 = new Note(0, "Whole note");
        System.out.println("Note 4: ");
        System.out.println(n4);
        System.out.println("----------------------");
    }

}
