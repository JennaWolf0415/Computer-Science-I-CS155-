
public class staff extends employee{
    
    private String title;   //holds the title data
    
    //no arg constructor
    public staff(){
    }
    
    //takes in five strings an int and a double and sets the values
    public staff(String temp1, String temp2, String temp3, String temp4, 
            int temp5, double temp6, String temp7){
        super(temp1, temp2, temp3, temp4, temp5, temp6);
        title = temp7;
    }
    
    //returns the title data
    public String getTitle()
    {
        return title;
    }
    
    //sets title to the string sent over
    public void setTitle(String temp)
    {
        title = temp;
    }
    
    //Sends back a string with the class name and name data
    public String toString()
    {
        return "staff, " + getName();
    }
}