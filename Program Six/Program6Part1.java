//summary: This program displays the first 100 pentagonal numbers by using methods
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/25/2023

public class Main
{
	public static void main(String[] args) 
	{
	    int count = 0;  //holds the count data and sets it to 0
	    
	    //displays what the program does
	    System.out.println("This program displays the first 100 pentagonal numbers with 10 on each line");
	    
	    //for loop the creates n and sets it to 1, makes sure n is less than 101, and adds 1 to n each time
		for(int n = 1; n < 101; n++)
		{
		    //calls the getPentagonalNumber method and outputs it
		    System.out.print(getPentagonalNumber(n) + " ");
		    count++;    //adds 1 to count
		    
		    //when count is 10, it ends the current line
		    if(count == 10)
		    {
		        count = 0;
		        System.out.println();
		    }
		}
	}


    //this method finds the pentagonal number for a integer and returns it
    public static int getPentagonalNumber(int n)
    {
        return n * (3 * n - 1) / 2; //returns the number computed by the equation
    
    }
}