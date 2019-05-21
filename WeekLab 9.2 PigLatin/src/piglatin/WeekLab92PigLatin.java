package piglatin; 

public class WeekLab92PigLatin 
{
    public static void main(String[] args) 
    {
        String str = "I SLEPT MOST OF THE NIGHT";
        System.out.println("English: " + str);
        System.out.println("Pig Latin: " + toPigLatin(str));
    }
    
    public static String toPigLatin(String str)
    {
        String finalStr = "";
        
        if(str.length() != 0)
        {
            int i = 0;
            while(i < str.length())
            {
                char firstChar = str.charAt(i);
                ++i;
                while(i < str.length() && str.charAt(i) != ' ')
                {
                    finalStr += str.charAt(i++);
                }
                finalStr += firstChar + "AY ";
                ++i;
            }
        }
        return finalStr;
    }

}
