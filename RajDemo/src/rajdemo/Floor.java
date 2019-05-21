
public class Floor 
{
    private double flooring, labor, material;
    private String name;
    private int len, wid;
    private static int num = 0;

    public Floor(int len, int wid, String name, double flooring, double labor, double material) 
    {
        this.labor = labor;
        this.material = material;
        this.flooring = flooring;
        this.name = name;
        this.len = len;
        this.wid = wid;
        num++;
    }

    public double getFlooring() {
        return flooring*this.getArea();
    }

    public void setFlooring(double flooring) {
        this.flooring = flooring;
    }

    public double getLabor() {
        return labor*this.getArea();
    }

    public void setLabor(double labor) {
        this.labor = labor;
    }

    public double getMaterial() {
        return material*this.getArea();
    }

    public void setMaterial(double material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }
    
    public double getArea()
    {
        return this.len*this.wid;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Floor.num = num;
    }
    
    public double getTotalCost()
    {
        return (this.labor + this.material + this.flooring) * this.getArea();
    }

    @Override
    public String toString() 
    {
        
        String s = String.format("%d%5d%5d%10.2f%7s%10.2f%10.2f%10.2f%10.2f",
                num,
                this.len, this.wid,
                this.getArea(),
                this.name, 
                flooring*this.getArea(), 
                labor*this.getArea(), 
                material*this.getArea() , 
                this.getTotalCost());
        return s;   
    }
}
