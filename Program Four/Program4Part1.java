//summary: This program takes in a social security number and makes sure that it is a proper one
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
	    String ss;                  //holds the ss data
	    boolean truess = false;     //holds the truess data and sets it to false
	    
	    //asks for and takes in the social security number
		System.out.println("Please enter your social security number and we will check if it is correct: ");
		System.out.println("make sure to include dashes!");
		ss = input.next();
		
		//checks to make sure the length is 11
		if(ss.length() == 11)
		{
		    //checks to make sure a proper social security number was entered
		    if(Character.isDigit(ss.charAt(0)) && Character.isDigit(ss.charAt(1)) && Character.isDigit(ss.charAt(2)) 
		        && ss.charAt(3) == '-' && Character.isDigit(ss.charAt(4)) && Character.isDigit(ss.charAt(5)) 
		        && ss.charAt(6) == '-' && Character.isDigit(ss.charAt(7)) && Character.isDigit(ss.charAt(8))
		        && Character.isDigit(ss.charAt(9)) && Character.isDigit(ss.charAt(10)))
		        truess = true;  //sets truess to true
		}
		
		//outputs different text depending on the value of truess
		if(truess)
	        System.out.println(ss + " is proper social security number!");
	    else
	        System.out.println(ss + "is not a proper social security number!");
	}
	
}