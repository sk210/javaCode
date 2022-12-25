package Geekster.Week1;
import java.util.Scanner;

public class PrintSumOfNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int result;
		int sum = 0;
		System.out.print("Enter the number : ");
		int number = userinput.nextInt();
		
		while(number >= 0) {
			result = number%10;
			number = number/10;
			sum = sum + result;
		}
		System.out.print(sum);
	}

}
