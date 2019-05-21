package lockdemo;

/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 2 #1.1
 */


public class Lock implements LockADT
{
    private int x, y, z, current;
    private boolean open;

    public Lock() 
    {
        this(0, 0, 0, 0);
    }
    
    public Lock(int x, int y, int z, int current)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.current = current;
        this.open = true;
    }
    
    public Lock(Lock obj)
    {
        this.x = obj.x;
        this.y = obj.y;
        this.z = obj.z;
        this.current = obj.current;
        this.open = obj.open;
    }

    @Override
    public int getX()
    {
        return x;
    }

    @Override
    public void setX(int x) 
    {
        this.x = x;
    }

    @Override

    public int getY() 
    {
        return y;
    }

    @Override
    public void setY(int y) 
    {
        this.y = y;
    }

    @Override
    public int getZ() 
    {
        return z;
    }

    @Override
    public void setZ(int z) 
    {
        this.z = z;
    }

    @Override
    public int getCurrent() 
    {
        return current;
    }

    @Override
    public void setCurrent(int current) 
    {
        this.current = current;
    }
    
    @Override
    public void alter(int x, int y, int z)
    {
        if(open)
        {
            setX(x);
            setY(y);
            setZ(z);
            this.current = z;  //While changing the combination, z is the last no. the pointer will be on.
            System.out.println("The lock combination is successfully altered.");
        }
        else
        {
            System.out.println("Sorry! The lock has to be opened before altering the combination.");
        }
        
    }
    
    @Override
    public void turn(int x, int y, int z)
    {
        System.out.println("First Number(" + x + "):");
        rotateOnce(this.current, 1); //Anticlockwise
        for(int i = 40; (i + this.current) % 40 != x; i--)
            System.out.print((i + this.current) % 40 + " ");
        System.out.println(x);
        this.current = x;
        
        System.out.println("Second Number(" + y + "):");
        rotateOnce(this.current, 0); //Clockwise
        for(int i = 0; (i + this.current) % 40 != y; i++)
            System.out.print((i + this.current) % 40 + " ");
        System.out.println(y);
        this.current = y;
        
        System.out.println("Third Number(" + z + "):");
        for(int i = 40; (i + this.current) % 40 != z; i--)
            System.out.print((i + this.current) % 40 + " ");
        System.out.println(z);
        this.current = z;
        
        open = (this.x == x && this.y == y && this.z == z);
        
    }
    
    public void rotateOnce(int strtPos, int dir)
    {
        if(dir == 0) //Clockwise
            for(int i = 0; i < 40; i++)
                System.out.print(((i + strtPos) % 40) +  " ");
        else        //Anticlockwise
            for(int i = 40; i > 0; i--)
                System.out.print(((i + strtPos) % 40) +  " ");
    }
    
    @Override
    public void close()
    {
        this.current = (int)(Math.random() * 40); //[0-39]
        this.open = false;
    }
    
    @Override
    public void attempt(int x, int y, int z)
    {
        turn(x, y, z);
    }
    
    @Override
    public void inquire()
    {
        String s = "CLOSE.";
        if(this.open)
        {
            s = "OPEN.";
        }
        System.out.println("The lock is currently " + s);
    }
    
    @Override
    public String toString()
    {
        String s = "CLOSE.";
        
        if(open)
            s = "OPEN.";
            
        return ("The dial is currently pointing at " + this.current + 
                ".\nAnd the lock currently is " + s);
    }
}
