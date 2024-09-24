//summary This program takes two data points from a user (a x and a y cordinate) and finds the distance between
//these two points.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 8/29/2023

import java.util.Scanner;   //alowes the user to input data

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double point1x, point1y, point2x, point2y, distance;    //holds the data used to perform calculations
	    
	    //gets the info from the user for point ones x and y and point twos x and y
		System.out.println("Please enter your x cordinate for point one: ");
		point1x = input.nextDouble();
		System.out.println("Please enter your y cordinate for point one: ");
		point1y = input.nextDouble();
		System.out.println("Please enter your x cordinate for point two: ");
		point2x = input.nextDouble();
		System.out.println("Please enter your y cordinate for point two: ");
		point2y = input.nextDouble();
		
		//performs the distance calculation
		distance = Math.pow(Math.pow((point2x - point1x), 2) + Math.pow((point2y - point1y), 2),0.5);
		
		//outputs the distance between the two points entered
		System.out.println("The distance between your two points is: " + distance);
		
		
	}
}
