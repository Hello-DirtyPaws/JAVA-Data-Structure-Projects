/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 1 #1
 */

package studentsdemo;

public interface StudentsADT 
{
    public abstract int getMaxNumOfStudents();
    //Returns the maxNumOfStudents
            
    public abstract void setMaxNumOfStudents(int maxNumOfStudents);
    //sets  this.maxNumOfStudents to maxNumOfStudents
    
    public abstract void addStudent(int id);
    //Adds a student with the given student ID
            
    public abstract void addCourse(int id, Course course);
    //Adds a course to the student with the given ID number
     
    public abstract void dropCourse(int id, Course course);
    //Drops a course from the student with the given ID number
            
    public abstract String toString();
    //represent the obj as a string
                
}
