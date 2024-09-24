//summary: this program uses recursion to find the greatest common divisor of two numbers
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 11/17/2023

import java.util.Scanner;   //lets inputs be made

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in); //names the input
	    double x, y;    //holds the x and y data
	    
	    //explains the program and takes in two numbers
	    System.out.println("This program will find the greatest common divisor of the two numbers you enter.");
		System.out.print("Please enter your first number: ");
		x = input.nextDouble();
		System.out.print("Please enter your second number: ");
		y = input.nextDouble();
		
		//callds the gcd function and outputs the results
		System.out.println("The greatest common divisor is " + gcd(x, y));
		
	}
	
	public static double gcd(double m, double n)
	{
	    //if m / n has a remainder of 0, n is returned. if not, gcd is called again
	    //with the current remainder
	    if(m % n == 0)
	        return n;
	    else
	        return gcd(n, m % n);
	}
}
