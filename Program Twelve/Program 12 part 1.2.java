//summary: This program does not use an exception handler to find errors in inputs of a simple caculator. This caculator can
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
        String temp;                //holds the temp data
        double num1 = 0, num2 = 0;  //holds the num1 and num2 data and sets it to 0
        char operator;              //holds the operator data
        
        //asks for and takes in number for num1
        System.out.print("Please enter a number: ");
	    temp = input.nextLine();
	    for(int i = 0; i < temp.length(); i++)
	    {
	        //checks to make sure an number was entered. if not error occurs and loop is reset
	        if(!Character.isDigit(temp.charAt(i)) && temp.charAt(i) != '.')
	        {
	            System.out.println("Error: Please enter a number!");
	            temp = input.nextLine();
	            i = -1;
	        }
	    }
	    num1 = Double.parseDouble(temp);    //sets num1 to temp after converting to double
	    
	    //asks for and takes in operator
	    System.out.print("please enter an operator (+, -, *, or /): ");
	    operator = input.nextLine().charAt(0);
	    
	    //makes sure that a proper operator was entered. if not, error occurs
	    while(operator != '+' && operator != '-' && operator != '*' && operator != '/')
	    {
	        System.out.println("Error: Please enter a operator!");
	        operator = input.nextLine().charAt(0);
	        
	    }
	    
	    //asks for and takes in number for num2
	    System.out.print("Please enter a number: ");
	    temp = input.nextLine();
	    for(int i = 0; i < temp.length(); i++)
	    {
	        //checks to make sure an number was entered. if not error occurs and loop is reset
	        if(!Character.isDigit(temp.charAt(i)) && temp.charAt(i) != '.')
	        {
	            System.out.println("Error: Please enter a number!");
	            temp = input.nextLine();
	            i = -1;
	        }

            //checks to make user is not dividing by 0. if so, error occurs and loop is reset
	        if(temp.equals("0") && operator == '/')
	        {
	            System.out.println("Error: You cannot divide by 0");
	            System.out.print("Please enter a number: ");
	            temp = input.nextLine();
	            i = -1;
	        }
	    }
	    num2 = Double.parseDouble(temp);    //sets num2 to temp after converting to double
	    
	    //based on the operator, statement is output and caculations are made
	    if(operator == '+')
	        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));    //+ operator
	    else if(operator == '-')
	        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));    //- operator
	    else if(operator == '*')
	        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));    //* operator
        else if(operator == '/')
	        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));    // / operator
	}
}
