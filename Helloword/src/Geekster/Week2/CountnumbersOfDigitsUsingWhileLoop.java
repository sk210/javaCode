package Geekster.Week2;
import java.util.Scanner;

public class CountnumbersOfDigitsUsingWhileLoop {
	
	public static int countOfDigit(long l) { 
		int cout = 0;
		while(l>0) {
			l = l/10;
			cout++;
		}
		return cout;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		char ch;
		do {
		System.out.print("Enter the number : ");
		long l = userinput.nextLong();
		System.out.println("your entered number is " + countOfDigit(l) + " Digit");
		System.out.println();
		
		System.out.print("You enter another number(y/n) : ");
		ch = userinput.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');

	}

}
