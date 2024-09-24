//summary: This program takes 3 numbers from the user and orders them from lowest to highest
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/25/2023

import java.util.Scanner;   //allows inputs to be made

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);    //labels input as input
	    
		double numA, numB, numC;    //holds the numA, numB, and numC data
		
		//takes in the three numbers from the user
		System.out.print("Please enter your first number: ");
		numA = input.nextDouble();
		System.out.print("Please enter your second number: ");
		numB = input.nextDouble();
		System.out.print("Please enter your third number: ");
		numC = input.nextDouble();
		
		//calls the displaySortedNumbers method
		displaySortedNumbers(numA, numB, numC);
	}
    
    //orders the three numbers entered by the user and displays them
    public static void displaySortedNumbers( double num1, double num2, double num3)
    {
        double temp;    //holds the temp data
        
        //checks to see if num2 is less that num1 and num3
        if(num2 < num1 && num2 < num3)
        {
            //switches num1 and num2
            temp = num1;    
            num1 = num2;
            num2 = temp;
        }
        else if(num3 < num1 && num3 < num2) //checks to see if num3 is less than num1 and num2
        {
            //switches num1 and num3
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        //checks to see is num3 is less that num2
        if(num3 < num2)
        {
            //switches num2 and num3
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        //outputs all numbers in ascending order
        System.out.println("Lowest: " + num1);
        System.out.println("Middle: " + num2);
        System.out.println("Highest: " + num3);
    }
}
