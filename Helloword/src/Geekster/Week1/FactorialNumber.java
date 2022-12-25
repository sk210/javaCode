package Geekster.Week1;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		// using for loop print factorial of number 
		System.out.println("using for loop print factorial of number");
		System.out.println();
		System.out.print("Enter the number : ");
		int number = userinput.nextInt();
		int factorial = 1;
		for(int i = 1;i<=number;i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial number is : " + factorial);
		
		System.out.println();
		System.out.println();
		
		// using while loop print factorial of number
		System.out.println("using while loop print factorial of number");
		System.out.println();
		System.out.print("Enter the number : ");
		int num = userinput.nextInt();
		int fact = 1;
		int i = 1;
		while(i<=num) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial number is : " + fact);

	}

}
