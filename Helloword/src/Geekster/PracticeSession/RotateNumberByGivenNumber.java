package Geekster.PracticeSession;

import java.util.Scanner;

public class RotateNumberByGivenNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = userinput.nextInt();
		System.out.print("Enter the number you can rotate : ");
		int rotate = userinput.nextInt();
		int counter = 0;
		int rem = 0;
		int ans;
		int power = 1;
		int value = 0;
		int number2;
		number2 = number;
		
		for(int i = 0;i<rotate;i++) {
			power = power *10;
		}
		while(number2 > 0) {
			counter++;
			number2 = number2/10;
			
		}
		
		
		 
			if(rotate > 0 && rotate < counter) {
				rem = number%power;
				value = (value*10) + (number/power);
				number = number/power;
			}
			else {
				System.out.print("you enter rotate more than number or 0 : ");
			}
			counter = counter - rotate;
		
		power = 1;
		
		for(int i = 0;i<counter;i++) {
			power = power *10;
		}
		
		int finalanswer;
		
		finalanswer = (rem*power) + value;
		
		System.out.println("your number is : " + finalanswer);

	}

}
