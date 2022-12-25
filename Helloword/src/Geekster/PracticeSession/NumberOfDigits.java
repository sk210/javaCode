package Geekster.PracticeSession;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = userinput.nextInt();
		int counter = 0;
		
		while(number > 0) {
			counter++;
			number = number/10;
			
		}
		System.out.println(counter);
		userinput.close();
	}

}
