package Geekster.PracticeSession;
import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		// using for loop print sum of number
		System.out.println("using for loop print sum of number");
		System.out.println();
		System.out.print("Enter a positive number : ");
		int a = userinput.nextInt();
		int sum = 0;
		for(int i = 0;i<=a;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of number is : " + sum);
		
		System.out.println();
		System.out.println();
		
		
		//using while loop print sum of number 
		System.out.println("using while lopp print sum of number");
		System.out.println();
		System.out.print("Enter a positive number : ");
		int b = userinput.nextInt();
		int value = 0;
		
		int i = 0;
		while(i<=b) {
			value = value + i;
			i++;
		}
		System.out.println("sum of number is : " + value);

	}

}
