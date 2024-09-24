//summary: makes a class named MyStack that serves as a extension to ArrayList. Then takes in 5 strings from the
//user and returns them in backwards order
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/30/2023

import java.util.Scanner;   //includes the Scanner class

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in); //lets the user makes inputs
		MyStack stack = new MyStack();             //holds the stack data
		
		//takes in 5 strings from the user
		System.out.println("Enter 5 strings: ");
		for(int i = 0; i < 5; i++)
		{
		    String temp = input.nextLine();
		    stack.push(temp);
		}
		
		//outputs the strings the user entered
		for(int i = 0; i < 5; i++)
		    System.out.println(stack.pop());
	}
}
