
public class circle
{
    private double radius = 1;  //holds the radius data
    
    //no args constructor
    circle(){
    }
    
    //constructor that takes in a double
    circle(double temp){
        radius = temp;
    }
    
    //returns the radius data
    public double getRadius()
    {
        return radius;
    }
    
    //sets radius to the double sent over
    public void setRadius(double temp)
    {
        radius = temp;
    }
    
    //caculates the area
    public double getArea()
    {
        //caculates and returns the radius
        return radius * radius * Math.PI;
    }
    
    //caculates the perimeter
    public double getPerimeter()
    {
        //caculates and returns the perimeter
        return 2 * radius * Math.PI;
    }
    
    //uses the circle data to return a string
    public String toString()
    {
        return String.format("Area: %.2f", getArea()) + String.format("\nPerimeter: %.2f", getPerimeter());
    }
}