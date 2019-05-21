/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 3 #2
 */

package studentsdemo; 

import java.util.Scanner;

public class StudentsDemo 
{    
    public static Scanner key = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        Students students = new Students(10);
        students.addStudent(1111);
        students.addStudent(1234);
        students.addStudent(2357);
        
        Course c1 = new Course("csc236", 4, 3, null);
        Course c2 = new Course("his101", 2, 4, null);
        Course c3 = new Course("csc162", 1, 3, c2);
        
        students.addCourse(1111, c3);
        students.addCourse(2357, c1);
        
        function(students);
    }    
    
    public static void display()
    {
        System.out.println("What action would you like to implement?");
        System.out.println("1: Show all Students");
        System.out.println("2: Add acourse");
        System.out.println("3: Drop a Course");
        System.out.println("9: Quit");
    }
    
    public static void function(Students students)
    {
        System.out.println("---------------------------------------------------\n");
        display();
        System.out.print("Please enter your choice: ");
        int choice = key.nextInt();
        System.out.println("");
        switch(choice)
        {
            case 1:
                System.out.println(students);
                function(students);
                break;
                
            case 2: 
                 System.out.print("Please enter the student ID: ");
                 int id = key.nextInt();
                 System.out.print("Please enter the course name: ");
                 String name = key.next();
                 System.out.print("Please enter the section number: ");
                 int sectionNum = key.nextInt();
                 System.out.print("Please enter the number of credits of the course: ");
                 int credits = key.nextInt();
                 
                 students.addCourse(id, new Course(name, sectionNum, credits, null));
                 
                 function(students);
                 break;
                 
            case 3: 
                 System.out.print("Please enter the student ID: ");
                 id = key.nextInt();
                 System.out.print("Please enter the course name: ");
                 name = key.next();
                 System.out.print("Please enter the section number: ");
                 sectionNum = key.nextInt();
                 System.out.print("Please enter the number of credits of the course: ");
                 credits = key.nextInt();
                 
                 students.dropCourse(id, new Course(name, sectionNum, credits, null));
                 
                 function(students);
                 break;
                 
            case 9:
                System.out.println("Thank you!!");
                System.exit(0);
                break;
                
            default :
                System.out.println("INVALID CHOICE");
                function(students);
                break;
        }
    }

}
