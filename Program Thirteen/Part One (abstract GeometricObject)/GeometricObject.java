import java.util.Date;  //lets the Date class be used

//abstract verision of the GeometricObject class
public abstract class GeometricObject{
    
    private String color = "white";         //holds the color data and defaults to white
    private boolean filled;                 //holds the filled data
    private java.util.Date dateCreated;     //holds the dateCreated data
    
    //no args constructor
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    //constructor that takes in a string and a boolean
    public GeometricObject(String temp1, boolean temp2){
        color = temp1;
        filled = temp2;
        dateCreated = new java.util.Date();
    }
    
    //returns the color data
    public String getColor()
    {
        return color;
    }
    
    //returns the filled data
    public boolean getFilled()
    {
        return filled;
    }
    
    //returns the dateCreated data
    public Date getDateCreated()
    {
        return dateCreated;
    }
    
    //sets color to the data sent over
    public void setColor(String temp)
    {
        color = temp;
    }
    
    //sets filled to the data sent over
    public void setFilled(boolean temp)
    {
        filled = temp;
    }
    
    //returns a string with the GeometricObject data
    @Override
    public String toString()
    {
        return "\nCreated on: " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
}