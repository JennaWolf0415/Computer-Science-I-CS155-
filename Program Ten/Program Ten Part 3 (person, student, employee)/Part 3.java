//summary: This program uses classes to create many classes that define different people. Each type of person has there
//own specific data, and some are super classes/sub classes of other classes.
//name: Jenna Wolf
//class: Fundamentals of Programming, CS155 - 01
//instructor: Dr. Art Kazmierczak
//date: 10/24/2023
public class Main
{
	public static void main(String[] args) 
	{
	    //creates and holds data for each class and uses its constructor to set its data
		person Mike = new person("Mike", "1313 Farewell Street", "7682232341", "MikeL13.aol.com");
		student Liam = new student("Liam", "7612 Hideaway Lane", "6452234342", "Liam.Wart04@gmail.com", student.JUNIOR);
		employee Carol = new employee("Carol", "6542 Klark Avenue", "7223431987", "Carolpharris@gmail.com", 17, 45600);
		faculty Hannah = new faculty("Hannah", "9231 Orange Lane", "2324467545", "HannahBanana@aol.com", 34, 65000,
		                            "MWF 3:00-4:00", "Teacher");
		staff Ian = new staff("Ian", "4432 Gumball Street", "5334236544", "IanCornwall@gmail.com", 10, 39000, "Janitor");
		
		System.out.println(Mike.toString());    //outputs the data for Mike
		System.out.println(Liam.toString());    //outputs the data for Liam
		System.out.println(Carol.toString());   //outputs the data for Carol
		System.out.println(Hannah.toString());  //outputs the data for Hannah
		System.out.println(Ian.toString());     //outputs the data for Ian
	}
}
