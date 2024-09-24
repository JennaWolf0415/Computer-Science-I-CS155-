import java.util.Date;  //lets the date class be used

public class account
{
    private int id = 0;                     //holds the id data and sets it to 0
    private double balance = 0;             //holds the balance data and sets it to 0
    private double annualInterestRate = 0;  //holds the annual interest rate data and sets it to 0
    private Date dateCreated = new Date();  //holds the date created data and sets it to the current date
    
    //no args constructor
    account(){
    }
    
    //constructor that sets the id and balance
    account(int a, double b){
        id = a;
        balance = b;
    }
    
    //gets the ID data and returns it
    public int getID()
    {
        return id;  //returns the id
    }
    
    //gets the balance data and returns it
    public double getBalance()
    {
        return balance; //returns the balance
    }
    
    //gets the annual interest rate data and returns it
    public double getAnnualInterestRate()
    {
        return annualInterestRate * 100;    //returns the annualInterestRate times 100 (turned into percent)
    }
    
    //gets the date created data and returns it
    public Date getDateCreated()
    {
        return dateCreated; //returns the dateCreated
    }
    
    //sets id to the value sent over
    public void setID(int temp)
    {
        id = temp;  //id is set to temp
    }
    
    //sets balance to the value sent over
    public void setBalance(double temp)
    {
        balance = temp; //balance is set to temp
    }
    
    //sets annualInterestRate to the value sent over divided by 100 (makes it a decimal)
    public void setAnnualInterestRate(double temp)
    {
        annualInterestRate = temp / 100;    //annualInterestRate is set to temp divided by 100
    }
    
    //finds the monthly interest rate and returns it
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12; //returns the annualInterestRate divided by 12
    }
    
    //finds the monthly interest and returns it
    public double getMonthlyInterest()
    {
        return getMonthlyInterestRate() * balance;  //calls the getMonthlyInterestRate method and times it by balance
    }
    
    //takes money away from the balance varaible
    public void withdraw(double temp)
    {
        balance = balance - temp;   //sets balance to balance minus the temp amount
    }
    
    //puts money in to the balance varaible
    public void deposit(double temp)
    {
        balance = balance + temp;   //sets balance to balance plus the temp amount
    }
}