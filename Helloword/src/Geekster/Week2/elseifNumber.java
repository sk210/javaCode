package Geekster.Week2;
import java.util.Scanner;

public class elseifNumber {
	
	public static void value(int number) {
		int length = String.valueOf(number).length();
		if(length == 3) {
			System.out.println("Enter number is three digit");
		}
		else if(length == 2) {
			System.out.println("Enter number is two digit");
		}
		else if(length == 1) {
			System.out.println("Enter number is one digit");
		}
		else {
			System.out.println("Enter number is more large");
		}
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		char c;
		do {
		System.out.print("Enter the imteger number : ");
		int number = userinput.nextInt();
			
		value(number);
		System.out.println();
		System.out.print("you can enter number again(y/n) : ");
		c = userinput.next().charAt(0);
		
		}while(c=='y' || c=='Y');

	}

}
