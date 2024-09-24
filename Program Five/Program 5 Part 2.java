//summary: This program displays the ASCII charcters in a tabular form from ! to ~
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/18/2023

public class Main
{
	public static void main(String[] args) {
	    
	    	int j = 0;  //holds the j data and sets it to 0

        	//tells the user what the program is doing
		System.out.println("This program displays the ASCII table from ! to ~");
		
		//for loop that creates i and sets it to 33, makes sure i us less than 127, and adds 1 to i each time
		for(int i = 33; i < 127; i++)
		{
		    System.out.print((char)i + " ");    //prints out the ASCII character and a space
		    j++;                                //adds 1 to j
		    
		    //checks if j equals 10
		    if(j == 10)
		    {
		        j = 0;                  //sets j to 0
		        System.out.println();   //ends the current line
		    }
		}
	}
}
