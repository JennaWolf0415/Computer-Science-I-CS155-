//summary: takes in a number of students, makes an array, and takes in grades for each student. it then finds the best grade,
// and gives each student a letter grade based on the best students grade
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/01/2023
import java.util.Scanner;   //allows inputs to be made


public class Main
{
	public static void main(String[] args) 
	{   
	    Scanner input = new Scanner(System.in);    //labels input as input
	    int numStudent;                            //holds the numStudent data
	    double best;                               //holds the best data
	    
	    //takes in the number of students
	    System.out.print("Enter the number of students: ");
	    numStudent = input.nextInt();
	    
	    Double[] studentGrade = new Double[numStudent]; //makes an array of size numStudent
	    
	    //takes in the grades of each student and makes sure it is between 0 and 100
	    System.out.print("Enter the grades of each student (put a space between each grade): ");
	    for(int i = 0; i < numStudent; i++)
	    {
	        studentGrade[i] = input.nextDouble();
	        if(studentGrade[i] > 100 || studentGrade[i] <= 0)
	        {
	            System.out.print("Please enter a proper grade: ");
	            studentGrade[i] = input.nextDouble();
	        }
	    }
	    
	    //sets best to the first grade and then goes through all grades and sees which one is actually the best
	    best = studentGrade[0];
	    for(int i = 1; i < numStudent; i++)
	    {
	        if(studentGrade[i] > best)
	            best = studentGrade[i];
	    }
	    
	    //displays the students number grade along with there alphabetical grade
	    for(int i = 0; i < numStudent; i++)
	    {
	        if(studentGrade[i] >= best - 10)
	            System.out.println("Student " + (i + 1) + " has a score of " + studentGrade[i] + " which is a A");
	        else if(studentGrade[i] >= best - 20)
	            System.out.println("Student " + (i + 1) + " has a score of " + studentGrade[i] + " which is a B");
	        else if(studentGrade[i] >= best - 30)
	            System.out.println("Student " + (i + 1) + " has a score of " + studentGrade[i] + " which is a C");
	        else if(studentGrade[i] >= best - 40)
	            System.out.println("Student " + (i + 1) + " has a score of " + studentGrade[i] + " which is a D");
	        else
	            System.out.println("Student " + (i + 1) + " has a score of " + studentGrade[i] + " which is a F");
	    }
		
	}
}
