/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 3 #3.2
 */

package studentsdemo;

public class Course 
{
    private String name;
    private int section, credits;
    private Course link;

    public Course()
    {
        this("", 0, 0, null);
    }

    public Course(String name, int section, int credits, Course link) 
    {
        this.name = name.toUpperCase().trim();
        this.section = section;
        this.credits = credits;
        this.link = link;
    }
    
    public Course(Course obj)
    {
        this.name = obj.name;
        this.section = obj.section;
        this.credits = obj.credits;
        //this.link is not set in accordance to the obj
        //as one might just want to add the particular course only
        //And if the user wants to add more courses he can use
        //this.setLink(obj.getLink());
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name.toUpperCase().trim();
    }

    public int getSection() 
    {
        return section;
    }

    public void setSection(int section) 
    {
        this.section = section;
    }

    public int getCredit() 
    {
        return credits;
    }

    public void setCredit(int credits) 
    {
        this.credits = credits;
    }

    public Course getLink() 
    {
        return link;
    }

    public void setLink(Course link) 
    {
        this.link = link;
    }

    public String toString()
    {
        String s = String.format("%s%s%02d%s", this.name, 
                                 " Section:", this.section, 
                                 " Credits:" + this.credits);
        
        return s;
    }
    
    
}
