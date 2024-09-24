
public class triangle extends GeometricObject{
    
    double side1 = 1;   //holds the side1 data and defaults to 1
    double side2 = 1;   //holds the side2 data and defaults to 1
    double side3 = 1;   //holds the side3 data and defaults to 1
    
    //no args constructor
    public triangle(){
    }
    
    //constructor that takes in 3 doubles
    public triangle(double temp1, double temp2, double temp3){
        side1 = temp1;
        side2 = temp2;
        side3 = temp3;
    }
    
    //returns the info in side1
    public double getSide1()
    {
        return side1;
    }
    
    //returns the info in side2
    public double getSide2()
    {
        return side2;
    }
    
    //returns the info in side3
    public double getSide3()
    {
        return side3;
    }
    
    //sets side1 to the double sent over
    public void setSide1(double temp)
    {
        side1 = temp;
    }
    
    //sets side2 to the double sent over
    public void setSide2(double temp)
    {
        side2 = temp;
    }
    
    //sets side3 to the double sent over
    public void setSide3(double temp)
    {
        side3 = temp;
    }
    
    //gets the area of a triangle
    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2; //finds s (needed for the area equation)
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));  //caculates and returns the area
    }
    
    //gets the perimeter of a triangle
    public double getPerimeter()
    {
        return (side1 + side2 + side3); //caculates and returns the perimeter
    }
    
    //displays the info about a triangle
    public String toString()
    {
        return "Triangle:\nSide 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3;
    }
    
}