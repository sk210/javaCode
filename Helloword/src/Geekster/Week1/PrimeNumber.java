package Geekster.Week1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);
		System.out.println("Enter number positive and grater than 2: ");
		int num = Number.nextInt();
		int cout = 0;
		if(num>2) {
			for(int i = 2; i < num;i++) {
				if(num%i == 0) {
					cout = cout+1;
				}
			}
		}else {
			System.out.println("number is negative or less than 2");
		}
		if(cout == 0) {
			System.out.println(num + " number is peime");
		}else {
			System.out.println(num + " number is not prime");
		}

	}

}
