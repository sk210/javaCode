package Geekster.PracticeSession;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = userinput.nextInt();
		int counter = 0;
//		while(number > 0) {
//			counter++;
//			number = number/10;
//			
//		}
		
		while(number > 0) {
			counter = number%10;
			number = number/10;
			System.out.println(counter);
		}

	}

}
