
public class employee extends person{
    
    private int office;         //holds the office data
    private double salary;      //holds the salary data
    private MyDate dateHired = new MyDate();    //holds the dateHired data and is set to a new MyDate
    
    //no args constructor
    public employee(){
    }
    
    //constructor that takes in four strings and int and a double and sets the values
    public employee(String temp1, String temp2, String temp3, String temp4, int temp5, double temp6){
        super(temp1, temp2, temp3, temp4);
        office = temp5;
        salary = temp6;
        dateHired = new MyDate();
    }
    
    //returns the office data
    public int getOffice()
    {
        return office;
    }
    
    //returns the salary data
    public double getSalary()
    {
        return salary;
    }
    
    //returns the dateHired data (in string format)
    public String getDateHired()
    {
        return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
    }
    
    //sets office to the data sent over
    public void setOffice(int temp)
    {
        office = temp;
    }
    
    //sets salary to the data sent over
    public void setSalary(int temp)
    {
        salary = temp;
    }
    
    //sets dateHired to a new MyDate
    public void setDateHired()
    {
        dateHired = new MyDate();
    }
    
    //Sends back a string with the class name and name data
    public String toString()
    {
        return "employee, " + getName();
    }
}