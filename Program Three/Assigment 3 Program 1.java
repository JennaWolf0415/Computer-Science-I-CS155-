//summary: This program takes 3 edges from a triangle and finds the perimeter. It also checks
// to make sure that one edge is not bigger than the sum of the other two edges
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/5/2023
import java.util.Scanner;   //allows inputs to be made

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in); //labels input as input
	    
	    double edge1, edge2, edge3, per, temp;  //holds the data for each double variable
	    
	    //takes in the data for all three edges
		System.out.println("Please enter the first edge of your triangle: ");
		edge1 = input.nextDouble();
		System.out.println("Please enter the second edge of your triangle: ");
		edge2 = input.nextDouble();
		System.out.println("Please enter the third edge of your triangle: ");
		edge3 = input.nextDouble();
		
		//checks to see if the value for one edge is bigger than the value of the other two edges combined
		if(edge1 > (edge2 + edge3) || edge2 > (edge1 + edge3) || edge3 > (edge1 + edge2))
		{
		    //prints an error message
		    System.out.println("You entered invalid amounts! (one edge cannot be more than the sum of the other two edges!)");
		    System.out.println("Please try again!");
		}
		else
		{
		    //adds all the edges together and displays the perimeter
		    per = edge1 + edge2 + edge3;
		    System.out.println("The perimeter of a triangle with edges of " + edge1 + ", " + edge2 + ", and " + edge3 + " is " + per);
		}
	}
}
