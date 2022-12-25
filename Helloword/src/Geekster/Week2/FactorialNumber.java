package Geekster.Week2;
import java.util.Scanner;

public class FactorialNumber {
	public static int factorial(int i) {
		// Here we find factorial of number :
		int fact = 1;
		while(i>0) {
			fact = fact*i;
			i--;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		char ch;
		do {
		System.out.print("Enter the number : ");
		int i = userinput.nextInt();
		System.out.print("your entered number factorial is : " + factorial(i));
		System.out.println();
		System.out.println();
		
		// Here we ask to user Do you want to find another number factorial : 
		System.out.print("you find another number factorial(y/n) : ");
		ch = userinput.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}

}
