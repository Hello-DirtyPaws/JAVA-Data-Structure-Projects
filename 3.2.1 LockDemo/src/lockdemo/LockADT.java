/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 2 #1.3
 */

package lockdemo;

public interface LockADT 
{
   public abstract int getX();
   //Gets the value of x
   
   public abstract int getY();
   //Gets the value of y
   
   public abstract int getZ();
   //Gets the value of z
   
   public abstract void setX(int x);
   //Sets the value of this.x to x
   
   public abstract void setY(int y);
   //Sets the value of this.y to y
   
   public abstract void setZ(int z);
   //Sets the value of this.z to z
   
   public abstract int getCurrent();
   //Gets the value of current position of the pointer
   
   public abstract void setCurrent(int current);
   //Sets the value of this.current to current
   
   public abstract void alter(int x, int y, int z);
   //Alters the lock code and sets it to x, y and z
   //if it's open.
   //Precondition: The lock must be open
   //Postcondition: The lock's combination has been altered
   
   public abstract void turn(int x, int y, int z);
   //Turns the lock wheel to x, y and z in 
   //anticlockwise, clockwise and anticlockwise manner respectively.
   //For x and y, it completes one full turn and
   //for z, it directly reaches the number.
      
   public abstract void close();
   //Closes the lock and sets to poiter to a random number
   
   public abstract void attempt(int x, int y, int z);
   //Makes an attempt to open the lock with the digits x, y and z.
   
   public abstract void inquire();
   //Checks the status of the lock; is it open or close
   
   @Override
   public abstract String toString();
   //Prints the current position of the pointer and
   //prints the current status of the lock; open or close
}
