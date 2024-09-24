//summary: This program takes in employee information and finds the net pay along with other variables
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/11/2023
import java.util.Scanner;   //allows inputs to be made

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);    //labels input as input
	    String name;    //holds the name data
	    double hours, payRate, fedTax, stateTax, grossPay, fedWith, stateWith, netPay;  //holds the data for all these variables
	    
	    //asks for and takes in the name
	    System.out.println("What is the employee's name?");
	    name = input.next();
	    
	    //asks for and takes in the hours
	    System.out.println("How many hours did the employee work this week?");
	    hours = input.nextDouble();
	    
	    //asks for and takes in the pay rate
	    System.out.println("What is the employee's pay rate?");
	    payRate = input.nextDouble();
	    
	    //asks for and takes in the federal tax
	    System.out.println("What is the federal tax witholding rate? (type in percentage, not decimal)");
	    fedTax = input.nextDouble();
	    
	    //asks for and takes in the state tax
	    System.out.println("What is the state tax witholding rate? (type in percentage, not decimal)");
	    stateTax = input.nextDouble();
	    
	    grossPay = hours * payRate;                     //caculates the gross pay
	    fedWith = (fedTax / 100) * grossPay;            //caculates the federal withdraw
	    stateWith = (stateTax / 100) * grossPay;        //caculates the state withdraw
	    netPay = grossPay - (fedWith + stateWith);      //caculates the net pay
	    
	    //outputs all information
	    System.out.println("Employee name: " + name);
	    System.out.println("Employee pay rate: $" + payRate);
	    System.out.println("Gross pay: $" + grossPay);
	    System.out.println("Deductions:");
	    System.out.println("    Federal Witholding (" + fedTax + "%): $" + fedWith);
	    System.out.println("    Federal Witholding (" + stateTax + "%): $" + stateWith);
	    System.out.println("    Total Deductions: $" + (fedWith + stateWith));
	    System.out.println("Net pay: $" + netPay);
	    
	}
	
}
