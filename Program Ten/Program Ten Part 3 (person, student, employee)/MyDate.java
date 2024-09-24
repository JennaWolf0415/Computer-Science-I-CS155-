import java.util.GregorianCalendar; //lets the Gregorian Calendar be used

public class MyDate{
    
    private int year;   //holds the year data
    private int month;  //holds the month data
    private int day;    //holds the day data
    
    //no arg constructor
    public MyDate(){
    }
    
    //constructor that takes in a long and uses the setDate method
    public MyDate(long temp){
        setDate(temp);
    }
    
    //constructor that takes in three ints and sets the variables
    public MyDate(int temp1, int temp2, int temp3){
        year = temp1;
        month = temp2;
        day = temp3;
    }
    
    //returns the year data
    public int getYear()
    {
        return year;
    }
    
    //returns the month data
    public int getMonth()
    {
        return month;
    }
    
    //returns the day data
    public int getDay()
    {
        return day;
    }
    
    //sets the date using the Gregorian Calendar
    public void setDate(long temp)
    {
        GregorianCalendar calander = new GregorianCalendar();   //creaetes a Gregorian Calendar variable
		calander.setTimeInMillis(temp); //uses the long to set the Gregorian Calendar
		year = calander.get(GregorianCalendar.YEAR);    //sets the year
		month = calander.get(GregorianCalendar.MONTH);  //sets the month
		day = calander.get(GregorianCalendar.DAY_OF_MONTH); //sets the day
    }
}