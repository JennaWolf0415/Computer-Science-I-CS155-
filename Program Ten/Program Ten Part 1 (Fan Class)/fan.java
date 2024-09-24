
public class fan {
    public final static int SLOW = 1;       //Constant that holds the SLOW value
    public final static int MEDIUM = 2;     //Constant that holds the MEDIUM value
    public final static int FAST = 3;       //Constant that holds the FAST value
    
    private int speed = SLOW;       //holds the speed data and defaults it to SLOW
    private boolean on = false;     //holds the on data and defaults it to false
    private double radius = 5;      //holds the radius data and defaults it to 5
    String color = "blue";          //holds the color data and defaults it to blue
    
    //no arg constuctor
    fan(){
    }
    
    //returns the speed data
    public int getSpeed()
    {
        return speed;
    }
    
    //returns the on data
    public boolean getOn()
    {
        return on;
    }
    
    //returns the radius data
    public double getRadius()
    {
        return radius;
    }
    
    //returns the color data
    public String getColor()
    {
        return color;
    }
    
    //sets the value sent over to speed
    public void setSpeed(int temp)
    {
        speed = temp;
    }
    
    //sets the value sent over to on
    public void setOn(boolean temp)
    {
        on = temp;
    }
    
    //sets the value sent over to radius
    public void setRadius(double temp)
    {
        radius = temp;
    }
    
    //sets the value sent over to color
    public void setColor(String temp)
    {
        color = temp;
    }
    
    //outputs the data about the fan
    public String toString()
    {
        if(on == true)  //outputs if fan is turned on
            return "Fan speed: " + getSpeed() + "\nFan Color: " + getColor() + "\nFan Radius: " + getRadius(); 
        else            //outputs if fan is turned off
            return "Fan Color: " + getColor() + "\nFan Radius: " + getRadius() + "\nFan is turned off";
    }
}