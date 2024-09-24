//summary: This program takes in an array of ten numbers and prints out the reversed order
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/01/2023
import java.util.Scanner; //allows inputs to be made

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);    //labels input as input
	    int[] numbers = new int[10];               //holds the number data (is an array of size 10)
	    
	    //takes in the ten numbers from the user
	    System.out.print("Enter ten integers, with a space between each: ");
	    for(int i = 0; i < 10; i++)
	        numbers[i] = input.nextInt();
	   
	   //prints out the numbers in reverse order
	   System.out.println("Numbers in reverse order:");
	    for(int i = 0; i < 10; i++)
	        System.out.print(numbers[10 - i - 1] + " ");
	}
}
