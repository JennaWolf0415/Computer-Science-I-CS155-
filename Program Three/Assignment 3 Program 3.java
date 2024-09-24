//summary: This program takes the price and weight of two boxes of rice and finds which one is the better deal.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 9/5/2023
import java.util.Scanner;   //allows inputs to be made

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);    //labels input as input
	    double weight1, weight2, price1, price2, box1, box2;    //holds the data for each double variable
	    
	    //prints a message and takes in the users input for the first box of rice
		System.out.println("Please enter the weight and price for your first package of rice");
		weight1 = input.nextDouble();
		price1 = input.nextDouble();
		
		//prints a message and takes in the users input for the second box of rice
		System.out.println("Please enter the weight and price for your second package of rice");
		weight2 = input.nextDouble();
		price2 = input.nextDouble();
		
		box1 = price1 / weight1;        //finds the price per pound of box 1
		box2 = price2 / weight2;        //finds the price per pound of box 2
		
		//displays a different message depending on the values of box 1 and box 2
		if(box1 < box2)
		    System.out.println("The first package of rice is the better deal");     //displayed if box 1 is lower in cost
		else if(box1 == box2)
		    System.out.println("The packages of rice are the same price");          //dispalyed if boxes are even deals
		else
		    System.out.println("The second package of rice is the better deal");    //displayed if box 2 is lower in cost
	}
}
