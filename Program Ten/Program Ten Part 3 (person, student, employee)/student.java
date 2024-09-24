
public class student extends person{
    
    public static int FRESHMAN = 1;     //is a constant named FRESHMAN and is set to 1
    public static int SOPHOMORE = 2;    //is a constant named SOPHOMORE and is set to 2
    public static int JUNIOR = 3;       //is a constant named JUNIOR and is set to 3
    public static int SENIOR = 4;       //is a constant named SENIOR and is set to 4
    private int grade;
    
    //no args constructor
    public student(){
    }
    
    //constructor that takes in four strings and 1 ints for the data values
    public student(String temp1, String temp2, String temp3, String temp4, int temp5){
        super(temp1, temp2, temp3, temp4);
        grade = temp5;
    }
    
    //sends back the grade data (sends a string depending on grades data)
    public String getGrade()
    {
        //if loop that sends back a string based on the number
        if(grade == 1)
            return "Freshman";
        else if(grade == 2)
            return "Sophomore";
        else if(grade == 3)
            return "Junior";
        else if(grade == 4)
            return "Senior";
        else
            return "Error";
    }
    
    //sets the grade to the data sent over (as long as its 1-4)
    public void setGrade(int temp)
    {
        //makes sure grade is between 1 and 4
        if(temp < 5 && temp > 0)
            grade = temp;
    }
    
    //Sends back a string with the class name and name data
    public String toString()
    {
        return "student, " + getName();
    }
}