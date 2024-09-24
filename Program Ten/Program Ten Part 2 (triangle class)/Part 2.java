//summary: This program uses classes to create a class named triangle, an extension of geometric object. This program takes
//in the side lengths, color, and weather the triangle is filled from the user and displays the sides, area, perimeter,
//color, and weather the triangle is filled.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/24/2023
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
        
        //outputs all info for the triangle
        System.out.println();
        System.out.println(tri.toString());
        System.out.printf("Area: %.2f", tri.getArea());
        System.out.println();
        System.out.println("Perimeter: " + tri.getPerimeter());
        System.out.println("Color: " + tri.getColor());
        if(tri.getFilled())
            System.out.println("Triangle is filled");
        else
            System.out.println("Triangle is not filled");
	}
}
