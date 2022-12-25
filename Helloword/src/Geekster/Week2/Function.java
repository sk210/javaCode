package Geekster.Week2;
import java.util.Scanner;

public class Function {
	
	public static String name() {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter your first name : ");
		String s = userinput.next();
		
		System.out.println();
		System.out.print("Enter your last name : ");
		String s1 = userinput.next();
		
		String s3 = s + s1;
		return s3;
		
	}

	public static void main(String[] args) {
		System.out.println("your full name is : " + name());
		
	}

}
