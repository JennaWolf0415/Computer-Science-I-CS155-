//summary: Caculates and displays the difference from feet and meters for feet 1-10 (plus 1 every time) 
//and meters 20-65 (plus 5 every time)
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/25/2023

public class Main
{
	public static void main(String[] args) 
	{
	    double foot = 1, meter = 20;    //holds the foot data (set to 1) and the meter data (set to 20)
	    
	    //says what the program does and outputs the header
	    System.out.println("This program displays the conversion from feet to meters");
	    System.out.println("Feet    Meter   | Meter   Foot");
	    
	    //for loop that creates int i set to 0, makes sure i is less than 10, and adds 1 to i each time
		for(int i = 0; i < 10; i++)
		    {
		        //outputs a chart of the feet and meters. also calls the methods
		        System.out.printf("%-8.1f", foot);
		        System.out.printf("%-8.3f", footToMeter(foot));
		        System.out.print("| ");
		        System.out.printf("%-8.1f", meter);
		        System.out.printf("%-8.3f", meterToFoot(meter));
		        System.out.println();
		        
		        foot++;             //adds 1 to foot
		        meter = meter + 5;  //adds 5 to meter
		    }
	}
	
	//caculates and returns the conversion from foot to meter
	public static double footToMeter(double foot)
	{
	    return 0.305 * foot;    //returns the caculated value
	}
	
	//caculates and returns the conversion from meter to foot
	public static double meterToFoot(double meter)
	{
	    return 3.279 * meter;   //returns the caculated value
	}
}
