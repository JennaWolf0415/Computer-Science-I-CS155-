//summary: This program uses classes to create a class named account. This class holds the ID, balance, annual interest rate,
// and date created varaibles. It allows the user to withdraw and deposit money, and it has accessors and mutators for each
// varaible
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/16/2023

import java.util.Date;  //allows the date class to be used

public class Main
{
	public static void main(String[] args) 
	{
		account test = new account(1122, 20000);    //holds the test data and sets some of the values
		test.setAnnualInterestRate(4.5);            //sets the annual interest rate to 4.5%
		
		test.withdraw(2500);    //withdraws 2500 dollars
		test.deposit(3000);     //deposits 3000 dollars
		
		//outputs the ID, balance, monthly interest, and date
		System.out.println("ID: " + test.getID());
		System.out.printf("Balance: $%.2f", test.getBalance());
		System.out.println();
		System.out.printf("Monthly Interest: $%.2f", test.getMonthlyInterest());
		System.out.println();
		System.out.println("Date: " + test.getDateCreated());
		
	}
}
