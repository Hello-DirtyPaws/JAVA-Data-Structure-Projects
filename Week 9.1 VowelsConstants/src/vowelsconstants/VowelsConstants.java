package vowelsconstants;

public class VowelsConstants 
{
    private String s;
    private int numOfVowels;
    private int numOfConsonants;

    public VowelsConstants() 
    {
        this.s = "";
        this.count();
    }

    public VowelsConstants(String s) 
    {
        this.s = s.toUpperCase();
        this.count();
    }

    private void count()
    {
        this.numOfVowels = 0;
        this.numOfConsonants = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || 
               s.charAt(i) == 'I' || s.charAt(i) == 'O' || 
               s.charAt(i) == 'U')
            {
                this.numOfVowels++;
            }
            else if(s.charAt(i) > 64 && s.charAt(i) < 91)
            {
                this.numOfConsonants++;
            }
        }
    }
    
    public int countVowels()
    {
        return this.numOfVowels;
    }
    
    public int countConsonants()
    {
        return this.numOfConsonants;
    }
}
