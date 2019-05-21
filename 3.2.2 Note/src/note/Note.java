/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 2 #2.2
 */

package note;

import java.text.DecimalFormat;

public class Note implements NoteADT
{
    private double frequency;
    private int value;
    private String keyColor, length, strValue;
    
    public Note()
    {
        this(-9, "Quarter note");
    }
    
    public Note(int value, String length)
    {
        setValue(value);
        this.length = length;
    }
    
    public Note(Note obj)
    {
        setValue(obj.value);
        this.length = obj.length;
    }
    
    @Override
    public void setValue(int value)
    {
        if(value < 3 && value > -10)
        {
            this.value = value;
            
            setStrValue(value);
            setKeyColor(value);
            setFrequency(value);
        }
        else
        {
            System.out.println("Invalid value.");
        }
    }
    
    @Override
    public void setStrValue(int value)
    {
        String s;
        switch(value) 
        {
            case 2:
                s = "B";
                break;
            case 1:
                s = "A#";
                break;
            case 0:
                s = "A";
                break;
            case -1:
                s = "G#";
                break;
            case -2:
                s = "G";
                break;
            case -3: 
                s = "F#";
                break;
            case -4:
                s = "F";
                break;
            case -5:
                s = "E";
                break;
            case -6:
                s = "D#";
                break;
            case -7:
                s = "D";
                break;
            case -8:
                s = "C#";
                break;
            case -9: 
                s = "C";
                break;
            default :
                s = "Not a valid value.";
                break;
        }
        this.strValue = s;
    }
    
    @Override
    public void setKeyColor(int value)
    {
        String s;
        switch(value) 
        {
            case 2:
                s = "White key (natural)";
                break;
            case 1:
                s = "Black key (sharp)";
                break;
            case 0:
                s = "White key (natural)";
                break;
            case -1:
                s = "Black key (sharp)";
                break;
            case -2:
                s = "White key (natural)";
                break;
            case -3: 
                s = "Black key (sharp)";
                break;
            case -4:
                s = "White key (natural)";
                break;
            case -5:
                s = "White key (natural)";
                break;
            case -6:
                s = "Black key (sharp)";
                break;
            case -7:
                s = "White key (natural)";
                break;
            case -8:
                s = "Black key (sharp)";
                break;
            case -9: 
                s = "White key (natural)";
                break;
            default :
                s = "Not a valid value.";
                break;
        }
        this.keyColor = s;
    }
    
    @Override
    public void setFrequency(int value) 
    {
        this.frequency = (double) (440 * Math.pow(2.0, value/12.0));
    }

    @Override
    public double getFrequency() 
    {
        return frequency;
    }

    @Override
    public int getValue()
    {
        return value;
    }

    @Override
    public String getKeyColor() 
    {
        return keyColor;
    }

    @Override
    public String getLength() 
    {
        return length;
    }

    @Override
    public String getStrValue()
    {
        return strValue;
    }
        
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("##0.000000");
        String freqFormatted = df.format(this.frequency);
        
        return (this.strValue + 
                "\nLength: " + this.length +
                "\nValue: " + this.value +
                "\n" + this.keyColor + 
                "\n" + freqFormatted + " Hz");
    }
}
