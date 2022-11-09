
import java.util.*;
public class Lessons {

	public static void main(String[] args) 
	{
		adding();
	}
	public static void greeting() 
	{
		System.out.println("Hello World!");		
		Scanner name = new Scanner (System.in);		
		System.out.print("Please Tell me your name:");		
		String greet = name.nextLine();
		System.out.println("Hello " + greet);
	}
	public static void adding() 
	{
		Scanner num1 = new Scanner(System.in);
		System.out.print("Give a number: ");
		int an1 = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.print("Give a second number: ");
		int an2 = num2.nextInt();
		
		int total = an1 + an2;
		System.out.println("Added together your answer is " + total);
	}

}
