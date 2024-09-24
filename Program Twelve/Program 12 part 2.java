//summary: This program uses the inputmismatchexception class to make sure two integers are input. It then finds the sum
//of the two integers.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 11/06/2023

import java.util.Scanner;                   //lets the scanner class be used
import java.util.InputMismatchException;    //lets the inputmismatchexception be used

public class Main
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);   //names the input
		int num1 = 0, num2 = 0;                   //holds the num1 and num2 data and sets it to 0
		boolean valid = false;                    //holds the valid data and sets it to false
		
		//asks the user to input two integers
		System.out.println("Enter two integer: ");
		while(!valid)   //checks to see if valid is false
		{
		    try{    //goes until user enters something that is not an int
		    num1 = input.nextInt(); //takes in users input
		    num2 = input.nextInt(); //takes in users input
		    valid = true;           //sets valid to true
		    } 
		    catch(InputMismatchException ex) {  //catches when non int inputs are made
		        input.nextLine();   //clears the input line
		        System.out.println("Input is invalid, please enter two integers!"); //outputs an error statement
		    }
		}
		//outputs num1 and num2 as well as there sum
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
}
