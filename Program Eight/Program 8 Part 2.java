//summary: This program uses the Gregorain Calendar class to output different dates
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/09/2023
import java.util.GregorianCalendar; //lets the Gregorian Calendar class be used

public class Main
{
	public static void main(String[] args) 
	{
		GregorianCalendar cal = new GregorianCalendar();    //holds the cal data using the GregorainCalendar class
		
		//tells the user what the program does
		System.out.println("This program uses the GregorianCalendar to show the Year, Month, and Day.");
		System.out.println();
		
		//outputs the current year, month, and day
		System.out.println("Current Year: " + cal.get(GregorianCalendar.YEAR));
		System.out.println("Current Month: " + cal.get(GregorianCalendar.MONTH));
		System.out.println("Current Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println();
		
		//sets cal to the value given
		cal.setTimeInMillis(1234567898765L);
		
		//outputs the year, month, and day of today since January 1st, 1970
		System.out.println("Time elapsed since January 1st, 1970");
		System.out.println("Year: " + cal.get(GregorianCalendar.YEAR));
		System.out.println("Month: " + cal.get(GregorianCalendar.MONTH));
		System.out.println("Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
