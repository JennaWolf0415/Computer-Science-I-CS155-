//summary: This program takes the rational class made in 13.13 and changes the internal representation of the fraction.
// it then replaces the methods in the class to work with the new representation.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 11/12/2023

public class Main
{
	public static void main(String[] args) 
	{
		Rational fractionOne = new Rational(4, 5);  //holds the fractionOne data
		Rational fractionTwo = new Rational(6, 8);  //holds the fractionTwo data
		
		//outputs adding, subtracting, multiplying, and dividing the fractions
		System.out.println(fractionOne + " + " + fractionTwo + " = " + fractionOne.add(fractionTwo));
		System.out.println(fractionOne + " - " + fractionTwo + " = " + fractionOne.subtract(fractionTwo));
		System.out.println(fractionOne + " * " + fractionTwo + " = " + fractionOne.multiply(fractionTwo));
		System.out.println(fractionOne + " / " + fractionTwo + " = " + fractionOne.divide(fractionTwo));
		
		//tells the user which fraction is larger
		if(fractionOne.compareTo(fractionTwo) == 1)
		    System.out.println("Fraction one is larger");
		else if (fractionOne.compareTo(fractionTwo) == -1)
		    System.out.println("Fraction two is larger");
		else
		    System.out.println("The two fractions are equal");
	}
}
