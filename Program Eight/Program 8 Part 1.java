//summary: makes a class entitled Rectangle and is used to find the width, height, area, and perimeter of a rectangle
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/09/2023
public class Main
{
	public static void main(String[] args) {
	    
	Rectangle Rec1 = new Rectangle(4, 40);      //holds the Rec1 data
    	Rectangle Rec2 = new Rectangle(3.5, 35.9);  //holds the Rec2 data
    
    	//tells the user what the program does
    	System.out.println("This program uses classes to find the width, height, area, and perimeter of rectangles!");
    	System.out.println();
    
    	//displays the data of the first rectangle
    	System.out.println("First Rectangle Properties:");
    	System.out.println("Width: " + Rec1.width);
    	System.out.println("Height: " + Rec1.height);
    	System.out.println("Area: " + Rec1.getArea());
    	System.out.println("Perimeter: " + Rec1.getPerimeter());
    	System.out.println();
    	
    	//displays the data of the second rectangle
    	System.out.println("Second Rectangle Properties:");
    	System.out.println("Width: " + Rec2.width);
    	System.out.println("Height: " + Rec2.height);
    	System.out.printf("Area: %.2f", Rec2.getArea());
    	System.out.println();
    	System.out.println("Perimeter: " + Rec2.getPerimeter());
    
	}
}
