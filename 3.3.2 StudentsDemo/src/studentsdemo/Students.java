/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 3 #3.1
 */

package studentsdemo;

public class Students implements StudentsADT
{
    //INNER CLASS BEGINS
    public class Student
    {
        private int id;
        private Course courses;
        
        public Student()
        {
            this.id = 0;
            this.courses = null;
        }
        
        public Student(int id)
        {
            this.id = id;
            //New obj will only store the student ID
            //The courses of the object will have to be set using addCourse()
            //or setCourses() only.
            this.courses = null;
        }
        
        public Course getCourses()
        {
            return this.courses;
        }
        
        public int getId()
        {
            return this.id;
        }
        
        public void setId(int id)
        {
            this.id = id;
        }
        
        public void setCourses(Course courses)
        {
            //Making a deep copy of the courses list
            Course curr1 = courses, 
                   curr2 = this.courses;
            
            this.courses = curr1;
            while(curr1 != null)
            {
                //assign
                curr2.setLink(curr1.getLink());
                
                //update
                curr2 = curr2.getLink();
                curr1 = curr1.getLink();
            }
        }
        
        public void addCourse(Course course)
        {
            if(this.courses == null)
            {
                this.courses =  course;
                System.out.println(course.getName() + " successfully added.");
                return;
            }
            //Reaches only when the courses list != null
            
            Course curr = this.getCourses();
            while(curr.getLink() != null)
            {
                curr = curr.getLink();
            }
            //Creating a new obj instead of using the one in the parameter
            //as it might contain another course in its link variable.
            curr.setLink(new Course(course));
            
            System.out.println(course.getName() + " successfully added.");
        }
        
        public Course dropCourse(Course course)
        {
            if(this.courses != null)
            {
                Course curr = this.getCourses(),
                        prev = curr;
                
                //Just check course name and section# to identify a course.
                //The #of credits is not needed to compare as name and section#
                //combination is unique for every course. 
                while(curr != null && 
                     !curr.getName().equals(course.getName()) && 
                      curr.getSection() != course.getSection())
                {
                    prev = curr;
                    curr = curr.getLink();
                }//Loop ends
                
                if(curr == null)
                {
                    System.out.println(course.getName() + " is not registered.");
                    return null;
                }
                else 
                {
                    if(curr == this.courses)
                        this.courses = this.courses.getLink();
                    else
                        prev.setLink(curr.getLink());
                    
                    System.out.println(course.getName() + " successfully removed.");
                    return curr;
                }//else for if(curr == this.courses) ends
                
            }//if(this.courses != null) ends
            
            //this.courses == null
            System.out.println(course.getName() + " is not registered.");
            return null;
        }
        
        public String toString()
        {
            String s = "Student ID# " + this.getId() + "\n";
            
            if(this.courses != null)
            {
                Course curr = this.courses;
                while(curr != null)
                {
                    s += "--> " + curr.toString() + "\n";
                    curr = curr.getLink();
                }
            }
            else
            {
                s += "--> NO COURSES REGISTERED YET.\n";
            }
            
            s += "----------------------------------------------";
            
            return s;
        }
        
    }//INNER CLASS ENDS
    
    private int maxNumOfStudents; 
    private Student [] student;    
    
    public Students()
    {
        this(10);
    }

    public Students(int maxNumOfStudents) 
    {
        this.maxNumOfStudents = maxNumOfStudents;
        this.student = new Student[maxNumOfStudents];
    }
    
    public Students(Students obj)
    {
        this.maxNumOfStudents = obj.getMaxNumOfStudents();
        
        this.student = new Student[maxNumOfStudents];
        //Reducing the looping to only the #of students added
        for(int i = 0; (i < maxNumOfStudents && obj.student[i] != null); i++)
        {
            //deep copy
            this.student[i] = obj.student[i];
        }
    }

    public int getMaxNumOfStudents() 
    {
        return maxNumOfStudents;
    }

    public void setMaxNumOfStudents(int maxNumOfStudents) 
    {
        this.maxNumOfStudents = maxNumOfStudents;
    }
    
    public void addStudent(int id)
    {
        int i;
        Student obj = new Student(id);
        
        for(i = 0; (i < maxNumOfStudents && student[i] != null); i++) 
        {
            //Loop to just get the value of i (index)
        }
        
        if(i < maxNumOfStudents)
        {
            //student[i] == null
            student[i] = obj;
        }
        else
        {
            System.err.println("CANNOT ADD ANY NEW STUDENT. OUT OF SPACE");
        }
    }
    
    public void addCourse(int id, Course course)
    {
        int i = 0;
        while(i < maxNumOfStudents && student[i] != null && student[i].getId() != id)
        {
            i++;
        }
        
        if(i < maxNumOfStudents && student[i] != null)
        {
            //student.getId() == id
            student[i].addCourse(course);
        }
        else
        {
            System.err.println("THE ENTERED STUDENT ID# " + id + " DOES NOT EXIST.\n"
                             + "THUS, CANNOT ADD " + course.getName());
        }
    }
    
    public void dropCourse(int id, Course course)
    {
        int i = 0;
        while(i < maxNumOfStudents && student[i] != null && student[i].getId() != id)
        {
            i++;
        }
        if(i < maxNumOfStudents && student[i] != null)
        {
            student[i].dropCourse(course);
        }
        else
        {
            System.err.println("THE ENTERED STUDENT ID# " + id + " DOES NOT EXIST.\n"
                             + "THUS, CANNOT DROP " + course.getName());
        }
    }
    
    public String toString()
    {
        int i = 0;
        String s = "";
        
        while(i < maxNumOfStudents && student[i] != null)
        {
            s += student[i++].toString() + "\n";
        }
        
        return s;
    }
}
