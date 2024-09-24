//summary: This program uses an exception handler to find errors in inputs of a simple caculator. This caculator can
//add, subtract, multiply, and divide.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 11/06/2023

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);   //names the input
	    boolean valid = false;          //holds the valid data and sets it to false
	    double num1 = 0, num2 = 0;      //holds the num1 and num2 data sets it to 0
		char operator;                  //holds the operator data
		
		while(!valid)   //loop goes until valid inputs are made
		{
	        try {
	            //takes in num1 data (error occurs if numbers are not input)
	            System.out.print("Please enter a number: ");
	            num1 = Double.parseDouble(input.nextLine());
	            
	            //takes in the operator (error occurs if improper opperator is input)
	            System.out.print("Please enter an operator (+, -, *, or /): ");
	            operator = input.nextLine().charAt(0);
	            if(operator != '+' && operator != '-' && operator != '*' && operator != '/')
	                throw new IllegalArgumentException("Ilegal Operator!");
	                
	            //takes in num2 data (error occurs if numbers are not input)
	            System.out.print("Please enter another number: ");
	            num2 = Double.parseDouble(input.nextLine());
	            
	            //based on the operator, statement is output and caculations are made
	            if(operator == '+')
	                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));    //+ operation
	            else if(operator == '-')
	                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));    //- operation
	            else if(operator == '*')
	                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));    //* operation
	            else if(operator == '/')
	            {
	                if(num2 == 0)   //if the second number input is 0, an error occurs
	                    throw new ArithmeticException("You cannot divide by 0!");
	                else
	                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));    // / operation
	            }
	            valid = true;
	                
	        }
	        catch(NumberFormatException ex) {   //catches when a non number is entered
	            System.out.println("Error: please enter a number!");
	        }
	        catch(ArithmeticException ex) {     //catches when a 0 is entered for the second part of division
	            System.out.println("Error: " + ex.getMessage());
		    }
		    catch(IllegalArgumentException ex) {    //catches when a wrong operator is entered
		        System.out.println("Error: " + ex.getMessage());
		    }
	    }
		
	}
}
