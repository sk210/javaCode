package Geekster.PracticeSession;

import java.util.Scanner;

public class PowerProblem {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the numbr : ");
		int a = userinput.nextInt();
		System.out.print("Enter the power : ");
		int b = userinput.nextInt();
		int c = 1;
		
		for(int i = 0;i<b;i++) {
			c = c*a;
		}
		System.out.println(c);

	}

}
