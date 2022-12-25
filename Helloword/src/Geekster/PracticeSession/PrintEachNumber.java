package Geekster.PracticeSession;

import java.util.Scanner;

public class PrintEachNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = userinput.nextInt();
		int rem;
		int rev = 0;
		
		
		while(number > 0) {
			rem = number%10;
			rev = (rev * 10) + rem;
			number = number/10;
		}
		
		while(rev > 0) {
			rem = rev%10;
			rev = rev/10;
			System.out.println(rem);
		}

	}

}
