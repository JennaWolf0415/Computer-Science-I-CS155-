//summary: This program allows the user to choose weather they want to convert Us dollars to Chinease RMB or vice versa.
// it then converts said currencys based on the users inputs. Also makes sure inputs are correct.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/5/2023
import java.util.Scanner;   //allows inputs to be made

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);     //labels input as input
	    int choice;             //holds the data for choice
	    double usDol, chiRMB;   //holds the data for each double variable
	    
	    //prints a message and takes in the users input
		System.out.println("Please enter 0 to convert US dollars to Chinease RMB and 1 to convert Chinease RMB to US dolalrs");
		choice = input.nextInt();
		
		//performs different actions depending on the users input
		if(choice == 0)
		{
		    //prints a message and takes the users input
		    System.out.println("Please enter the US dollar amount you would like to convert to Chinease RMB");
		    usDol = input.nextDouble();
		    
		    chiRMB = usDol * 6.81;  //converts US Dollar to Chinease RMB
		    
		    //displays the converted amount
		    System.out.println("With $" + usDol + ", you will have " + chiRMB + " yuan");
		}
		else if(choice == 1)
		{
		    //prints a message and takes the users input
		    System.out.println("Please enter the Chinease RMB amount you would like to convert to US dollars");
		    chiRMB = input.nextDouble();
		    
		    usDol = chiRMB / 6.81;  //converts Chinease RMB to US dollars
		    
		    //displays the converted amount
		    System.out.println("With " + chiRMB + " yuan, you will have $" + usDol);
		}
		else
		    System.out.println("You entered a invalid choice! Please try again!");  //displays an error message
	}
}
