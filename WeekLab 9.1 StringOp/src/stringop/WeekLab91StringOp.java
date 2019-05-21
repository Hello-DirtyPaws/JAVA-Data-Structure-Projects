package stringop; 

public class WeekLab91StringOp 
{
    public static void main(String[] args) 
    {
        String s1 = "the dog jumped over the fence";
        String s2 = "the", s3 = "that";
        char[] charArry = {'t', 'h', 'e', ' ', 'd', 'o', 'g', '.'};
        System.out.println("The total words in \"" + s1 + "\" is: " + wordCount(s1));
        System.out.println("The char array to string output: " + arrayToString(charArry));
        System.out.println("The most frequent character in \"" + s1 + "\" is: " + mostFrequent(s1));
        System.out.println();
        System.out.println("Replacing all the \"" + s2 + "\" with \"" + s3 +"\" from the string below:");
        System.out.println(s1);
        System.out.println("And below is the replaced String:");
        System.out.println(replaceSubstring(s1, s2, s3));
    }
    
    public static int wordCount(String s) 
    {
        if(s.length() == 0)
        {
            return 0;
        }
        int count = 1;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
                count++;
        }
        return count;
    }

    public static String arrayToString(char[] charArry) 
    {
        String s = "";
        
        for(int i = 0; i < charArry.length; i++)
        {
            s += charArry[i];
        }
        
        return s;
    }
    
    public static char mostFrequent(String s) 
    {
        s = s.toUpperCase();
        int[] arry = new int[26];
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ' && s.charAt(i) != '.')
                arry[s.charAt(i) - 65]++;
        }
        
        int max = arry[0];
        for(int i = 0; i < 26; i++)
        {
            if(arry[i] > max)
                max = i;
        }
        
        return (char)(max + 65);
    }
    public static String replaceSubstring(String s1, String s2, String s3) 
    {
        return s1.replaceAll(s2, s3);
    }
}
