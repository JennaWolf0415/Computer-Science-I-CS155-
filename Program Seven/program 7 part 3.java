//summary: takes in 10 numbers from the user into an array and goes to the min method to find the smallest number
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
	    double[] numbers = new double[10];         //holds the numbers data (is an array of size 10)
	    
	    //takes in 10 numbers from the user
	    System.out.print("Enter ten numbers, with a space between each: ");
	    for(int i = 0; i < 10; i++)
	        numbers[i] = input.nextDouble();
	   
	   //calls the min method and outputs what is returned
	   System.out.println("The smallest number out of these ten numbers is " + min(numbers));
	}
	
	public static double min(double[] array)
	{
	    double smallest = array[0]; //holds the smallest data and sets it to the first number in the array
	    
	    //loop that sees if the current digit in the array is smaller than the current smallest. if yes, then
	    //sets said number to the smallest
	    for(int i = 1; i < 10; i++)
	    {
	        if(array[i] < smallest)
	            smallest = array[i];
	    }
	    return smallest;    //returns the smallest data
	}
}
