//summary: This program takes in the loan amount and loan period anf finds the monthly payment and total payment
// for that loan from 5% to 8% using increments of 1/8
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/18/2023

import java.util.Scanner;   //allows inputs to be made

public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);    //labels input as input
		
		int loanPeriod;                                             //holds the loanPeriod data
		double loanAmount, monthlyPay, totalPay, monthlyInterest;   //hold the data for each variable
		
		//asks for and takes in the loan amount
		System.out.print("Please enter your loan amount: ");
		loanAmount = input.nextDouble();
		
		//asks for and takes in the loan period
		System.out.print("Please enter your loan period (in years): ");
		loanPeriod = input.nextInt();
		
		//creates a space and displays each column header
		System.out.println();
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		//for loap that creates i and sets it to 5%, keeps going while i is less that 8.125%, and adds 0.125% each time
		for(double i = 0.05; i < 0.08125; i = i + 0.00125)
		{
		    // caculates the monthly interest rate, the monthly pay, and the total pay
		    monthlyInterest = i / 12;
		    monthlyPay = (loanAmount * monthlyInterest) / (1 - 1 / Math.pow(1 + monthlyInterest, loanPeriod * 12));;
		    totalPay = monthlyPay * 12 * loanPeriod;
		    
		    //displays the percentage of interest, the monthly pay, and the total pay
		    System.out.printf("%-5.3f%%", i * 100);
		    System.out.print("           $");
		    System.out.printf("%-18.2f", monthlyPay);
		    System.out.print("$");
		    System.out.printf("%-10.2f", totalPay);
		    System.out.println();
		}
		
	}
}
