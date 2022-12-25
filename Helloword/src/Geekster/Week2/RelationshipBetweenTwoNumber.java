package Geekster.Week2;
import java.util.Scanner;

public class RelationshipBetweenTwoNumber {
	
	public static String Relationship(int a,int b) {
		
	String ch = (a>b)? "a is grater than b" : (b>a) ? "b is grater than a" : "a and b both are equals"; 
	return ch;
	}

	public static void main(String[] args) {
		 Scanner userinput = new Scanner(System.in);
		 
		 System.out.print("Enter the first number : ");
		 int a = userinput.nextInt();
		 
		 System.out.print("Enter the second number : ");
		 int b = userinput.nextInt();
		 
		 System.out.println(Relationship(a,b));

	}

}
