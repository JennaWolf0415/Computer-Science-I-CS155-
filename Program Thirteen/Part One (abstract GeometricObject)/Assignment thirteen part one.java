//summary: This program uses the GeometricObject class and traingle class from a few assignments ago and has us make
//the geormetricObject class an abstract class. We then use the classes to take in the side lengths, color, and filled
//property from the user and display each attribute along with the area and perimeter
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 11/12/2023
import java.util.Scanner;   //lets inputs be made

public class Main
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);     //names the input object
        double triSide1, triSide2, triSide3;        //holds the data for these objects
        String triColor;                            //holds the triColor data
        boolean triFilled;                          //holds the triFilled data
        
        //takes in the sides from the user
        System.out.print("Enter sides of your triangle: ");
        triSide1 = input.nextDouble();
        triSide2 = input.nextDouble();
        triSide3 = input.nextDouble();
        
        //takes in the color from the user
        System.out.print("Enter the color of your triangle: ");
        triColor = input.next();
        
        //takes in the filled property from the user
        System.out.print("indicate weather your triangle is filled of empty (true or false): ");
        triFilled = input.nextBoolean();
        
        triangle tri = new triangle(triSide1, triSide2, triSide3);  //creates a new triangle object
        tri.setColor(triColor);         //sets the color of the triangle
        tri.setFilled(triFilled);       //sets the filled property of the triangle
        
        //calls the toString method and outputs information
        System.out.println(tri);
	}
}
