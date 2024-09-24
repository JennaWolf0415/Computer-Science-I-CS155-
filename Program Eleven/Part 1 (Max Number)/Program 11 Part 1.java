//summary: uses the ArrayList class to take in as many numbers as the user wants and then finds the largest
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/30/2023

import java.util.Scanner;       //lets the user make inputs
import java.util.ArrayList;     //lets the ArrayList class be used

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);             //names the input
	    ArrayList<Integer> list = new ArrayList<Integer>(); //holds the list data
	    int num;    //holds the num data
	    
	    //asks the user for a sequence of numbers
		System.out.println("Please enter a sequence of numbers ending with 0: ");
		num = input.nextInt();  //takes in the users input
		
		//while num does not equal 0, the loop continues
		while(num != 0)
		{
		    list.add(num);          //adds num to list
		    num = input.nextInt();  //takes in the next number
		}
		
		//outputs the max number in the list
		System.out.println("The max number in the array is " + max(list));
	}
	
	//finds the largest number
	public static Integer max(ArrayList<Integer> list)
	{
	   int max; //holds the max data
	   
	   //checks to see if list is empty and returns null
	   if(list.isEmpty())
	        return null;
	   else
	   {
	       max = list.get(0);   //sets max to the first element on the list
	       
	       //for loop that goes until i is bigger than the list size
	       for(int i = 0; i < list.size(); i++)
	       {
	           //checks if max is less than the current list number
	           if(max < list.get(i)) 
	                max = list.get(i);  //max is set to the current list number
	       }
	       return max;  //returns max
	   }
	}
	
}
