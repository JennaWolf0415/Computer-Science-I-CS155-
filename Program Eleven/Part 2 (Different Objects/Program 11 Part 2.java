//summary: This program uses the ArrayList to store data of different data types and output each in string form
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/30/2023

import java.util.ArrayList;     //allows ArrayList to be used
import java.util.Date;          //allows Date to be used

public class Main
{
	public static void main(String[] args) 
	{
	    ArrayList<Object> list = new ArrayList<Object>();   //holds the list data
	    
	    list.add(new loan(0.12, 5, 5000));      //adds a loan to the list
	    list.add(new Date());                   //adds a Date to the list
	    list.add(new String("I'm a string!"));  //adds a String to the list
	    list.add(new circle(11));               //adds a circle to the list
	    
	    //outputs all data in the List
		System.out.println((list.get(0)).toString());
		System.out.println((list.get(1)).toString());
		System.out.println((list.get(2)).toString());
		System.out.println((list.get(3)).toString());
	}
}
