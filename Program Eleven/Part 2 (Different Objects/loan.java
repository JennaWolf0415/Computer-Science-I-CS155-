
import java.util.Date;  //allows the Date data type to be used

public class loan {
    private double annualInterestRate;  //holds the annualInterestRate data
    private int numberOfYears;          //holds the numberOfYears data
    private double loanAmount;          //holds the loanAmount data
    private Date loanDate = new Date(); //holds the loanDate data
    
    //no args constructor    
    loan() {
    }
       
    //constructor that takes in 2 doubles and an int 
    loan(double temp1, int temp2, double temp3) {
        annualInterestRate = temp1;
        numberOfYears = temp2;
        loanAmount = temp3;
        loanDate = new Date();
    }
    
    //returns the annualInterestRate data
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    //returns the numberOfYears data
    public int getNumberOfYears()
    {
        return numberOfYears;
    }
    
    //returns the loanAmount data
    public double getLoanAmount()
    {
        return loanAmount;
    }
    
    //returns the loanDate data
    public Date getLoanDate()
    {
        return loanDate;
    }
    
    //sets the annualInterestRate to the double sent over
    public void setAnnualInterestRate(double temp)
    {
        annualInterestRate = temp;
    }
    
    //sets the numberOfYears to the int sent over
    public void setNumberOfYears(int temp)
    {
        numberOfYears = temp;
    }
    
    //sets the loanAmount to the double sent over
    public void setLoanAmount(double temp)
    {
        loanAmount = temp;
    }
    
    //caculates the monthly payment
    public double getMonthlyPayment()
    {
        double monthlyInterest = annualInterestRate / 1200; //finds the monthly interest rate
        //caculates and returns the monthly payment amount
        return loanAmount * monthlyInterest / (1 - (1 / Math.pow(1 + monthlyInterest, numberOfYears * 12)));
    }
    
    //caculates the total amount
    public double getTotalAmount()
    {
        //caculates and returns the total amount
        return getMonthlyPayment() * numberOfYears * 12;
    }
    
    //uses the loan data to return a string
    public String toString()
    {
        return String.format("Total Amount of loan: %.2f", getTotalAmount());
    }
}