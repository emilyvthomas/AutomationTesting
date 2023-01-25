package Assignment;




public class AreaOfFigures
{
    void area(float x)
    {
    	float sarea=x*x;
        System.out.println("the area of the square is "+sarea);
    }
    void area(float x, float y)
    {
    	float rarea=x*y;
        System.out.println("the area of the rectangle is "+rarea);
    }
    void area(double x)
    {
        double carea = 3.14 * x * x;
        System.out.println("the area of the circle is "+carea);
    }

    public static void main(String args[]) 
	{
    	AreaOfFigures ob = new AreaOfFigures();
	   ob.area(5);
	   ob.area(10,2);
	   ob.area(2.5);
       }
}