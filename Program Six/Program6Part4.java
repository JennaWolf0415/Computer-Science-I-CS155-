//summary: takes in the user input and created a matrix of n by n of 0's and 1's (random)
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/25/2023

import java.util.Scanner;   //allows inputs to be made
import java.util.Random;    //allows random numbers to be generated

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);    //labels input as input
	    
		int num;    //hold the num data
		
		//takes in a integer from the user
		System.out.print("Please enter any Integer and this program will make a matrix of n by n with 0's and 1's: ");
		num = input.nextInt();
		
		printMatrix(num);   //calls the printMatrix method
	}
	
	//displays a matrix of size n by n of random 0's and 1's
	public static void printMatrix(int n)
	{
	     Random rand = new Random();    //labels random as rand
	     
	     //for loop that creates the int i at 0, makes sure i is less than n, and adds 1 to i each time
	    for(int i = 0; i < n; i++)
	    {
	        //for loop that creates the int j at 0, makes sure j is less than n, and adds 1 to j each time
	        for(int j = 0; j < n; j++)
	            System.out.print(rand.nextInt(2) + " ");    //displays the random 1 or 0 with a space
	            
	        System.out.println();   //prints a line
	    }
	}
}
