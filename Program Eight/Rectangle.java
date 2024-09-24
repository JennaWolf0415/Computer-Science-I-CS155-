//Summary: Rectangle class that holds all data about a rectangle
public class Rectangle 
{
    double width = 1;   //holds the width data and sets it to 1
    double height = 1;  //holds the height data and sets it to 1
    
    //empty constructor
    Rectangle(){
    }
    Rectangle(double w, double h)   //constructor that takes the data values and sets width and height to them
    {
        width = w;  //sets width to w
        height = h; //sets height to h
    }
    
    //function that returns the area of a rectangle
    double getArea(){
        return width * height;  //returns width times height
    }
    
    //function that returns the perimeter of a rectangle
    double getPerimeter(){
        return (width * 2) + (height * 2);  //returns the width times 2 plus the height times 2
    }
}