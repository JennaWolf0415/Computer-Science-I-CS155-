//summary This program takes in the farenheit and the wind speed from the user and finds the wind chill using that data
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 8/29/2023

import java.util.Scanner;   //alowes the user to input data

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double far, wind, v, chill;     //holds the data used to perform calculations
	    
	    //gets the info from the user about the farenheit and the wind speed
		System.out.println("Enter a temperature between -58 and 41 degrees farenheit: ");
		far = input.nextDouble();
		System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
		wind = input.nextDouble();
		
		//finds the velocity of the wind
		v = Math.pow(wind, 0.16);
		
		//caculates the wind chill
		chill = 35.74 + (0.6215 * far) - (35.75 * v) + (0.4275 * far * v);
		
		//outputs the wind chill
		System.out.println("The wind chill index is: " + chill);
	}
}
