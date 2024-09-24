//summary: This program finds all the leap years between 101 and 2100 and displays them, 10 per line. It then displays
// how many leap years are between these two years (note: leap years take place every 4 years no counting end of 
// century dates that are not divisable by 400 [2000 was a leap year, 1900 was not])
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/18/2023

public class Main
{
	public static void main(String[] args) 
	{
	    int count = 0;   //holds the count data and sets it to 0
	    
	    //tells the user what the program does
		System.out.println("This program displays all the leap years from the year 101 to the year 2100");
		
		//for loop that creates i and sets it to 101, makes sure i is less than 2101, and adds 1 to i each loop
		for(int i = 101; i < 2101; i++)
		{
		    //if statement that checks if i is divisable by 400 or if i is divisable by 4 but not 100
		    if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
		    {
		        //outputs the current leap year and a space
		        System.out.print(i + " ");
                count++;                    //count has 1 added to it
                
                //checks to see if count is divisable by 10. if it is, ends the current line.
		        if(count % 10 == 0)
		            System.out.println();
		    }
		}
		//displays how many leap years there are between 101 and 2100
		System.out.println();
		System.out.println("There are " + count + " leap years in the period of time between 101 and 2100");
	}
}
