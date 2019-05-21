/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 2 #2.1
 */

package note;

public interface NoteADT 
{
    public abstract void setValue(int value);
    //Sets the note value to the formal parameter
    
    public abstract void setStrValue(int value);
    //Sets the name of the key using note value
    
    public abstract void setKeyColor(int value);
    //Sets the key color using the note value
    
    public abstract void setFrequency(int value);
    //Calculates and formats the frequency of the note 
    //  using the note value
    
    public abstract double getFrequency();
    //Returns the frequency
    
    public abstract int getValue();
    //Returns the note value
    
    public abstract String getKeyColor();
    //Returns the key color
    
    public abstract String getLength();
    //Returns the length of the note
    
    public abstract String getStrValue();
    //Returns the name of the key or note
    
    @Override
    public abstract String toString();
    //Returns a String giving a complete detail of a particular note
}
