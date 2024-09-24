
public class faculty extends employee{
    
    private String officeHours; //holds the officeHours data
    private String rank;        //holds the rank data
    
    //no args constructor
    public faculty(){
    }
    
    //takes in six strings an int and a double and sets the values
    public faculty(String temp1, String temp2, String temp3, String temp4, 
                    int temp5, double temp6, String temp7, String temp8){
        super(temp1, temp2, temp3, temp4, temp5, temp6);
        officeHours = temp7;
        rank = temp8;
    }
    
    //returns the officeHours data
    public String getOfficeHours()
    {
        return officeHours;
    }
    
    //returns the rank data
    public String getRank()
    {
        return rank;
    }
    
    //sets officeHours to the String sent over
    public void setOfficeHours(String temp)
    {
        officeHours = temp;
    }
    
    //sets rank to the String sent over
    public void setRank(String temp)
    {
        rank = temp;
    }
    
    //Sends back a string with the class name and name data
    public String toString()
    {
        return "faculty, " + getName();
    }
}