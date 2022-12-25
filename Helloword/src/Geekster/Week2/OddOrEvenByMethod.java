package Geekster.Week2;
import java.util.Scanner;

public class OddOrEvenByMethod {
	public static String OddOrEven(int number) {
		// Here is operation for check that number is even or odd :
		String result;
		if(number%2 == 0) {
			result = "Even";
		}else {
			result = "Odd";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		char ch;
		do {
		System.out.print("Enter the number to find number is odd or even : ");
		int number = userinput.nextInt();
		System.out.println("Your entered number is " + OddOrEven(number));
		System.out.println();
		// Here we ask to user Do you want to continue for check the number is even or odd :
		System.out.print("Do you want check another number for odd or even(y/n) : ");
		ch = userinput.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}

}
