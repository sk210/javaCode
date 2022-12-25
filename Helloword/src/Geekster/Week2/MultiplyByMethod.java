package Geekster.Week2;
import java.util.Scanner;

public class MultiplyByMethod {
	
	public static float Multiplication(float a,float b) {
		float c;
		c = a*b;
		return c;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		float a = userinput.nextFloat();
		
		System.out.print("Enter the second number : ");
		float b = userinput.nextFloat();
		
		System.out.println();
		
		System.out.println("your multiplication value is : " + Multiplication(a,b));
		
		

	}

}
