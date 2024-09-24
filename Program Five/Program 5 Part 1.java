//summary: This program finds the largest integer that is less that 12,000 when cubed by using a while loop
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/18/2023

public class Main
{
	public static void main(String[] args) {
		int i = 1;  //holds the data for i and sets it to 1
		
		//tells the user what the program is doing
		System.out.println("This program finds the largest integer that is less than 12,000 when cubed");
		
		//while loop that iterates while i + 1 cubed is less that 12000
		while(Math.pow(i + 1, 3) < 12000)
		    i++;    //adds 1 to i
		
		//tells the user which integer cubed is less than 12,000
		System.out.println("The largest integer that is less than 12,000 when cubed is " + i);
	}
}
