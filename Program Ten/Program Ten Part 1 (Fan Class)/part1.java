//summary: This program uses classes to create a class named fan. This class holds the data for a fan and can output said
//data for the fan. A fan has a speed, on setting, radius, and color.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/24/2023
public class Main
{
	public static void main(String[] args) 
	{
		fan fanOne = new fan(); //creates a new fan object
		fan fanTwo = new fan(); //creates a new fan object
		
		fanOne.setSpeed(fan.FAST);      //sets the speed for fan1
		fanOne.setOn(true);             //sets the on for fan1
		fanOne.setRadius(10);           //sets the radius for fan1
		fanOne.setColor("yellow");      //sets the color for fan1
		
		fanTwo.setSpeed(fan.MEDIUM);    //sets the speed for fan2
		fanTwo.setOn(false);            //sets the on for fan2
		fanTwo.setRadius(5);            //sets the radius for fan2
		fanTwo.setColor("blue");        //sets the color for fan2
		
		System.out.println(fanOne.toString());  //outputs the data for fan1
		System.out.println();                   //creates a space
		System.out.println(fanTwo.toString());  //outputs the data for fan2
	}
}
