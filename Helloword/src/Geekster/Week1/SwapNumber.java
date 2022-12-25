package Geekster.Week1;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		// take first number from user
		System.out.print("Enter First number : ");
		int a = userinput.nextInt();
		
		// take Second number from user 
		System.out.print("Enter Second number : ");
		int b = userinput.nextInt();
		
//		userinput.close();
		
		int temp;
		
		// Swaping method : 
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println();
		
		// swap value of First number and Second number : 
		
		System.out.println("After Swaping");
		System.out.println("Value of First number is : " + a);
		System.out.println("Value of Second number is : " + b);
		

	}

}
