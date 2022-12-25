package Geekster.Week3;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the binary number : ");
		int n = userinput.nextInt();
		int rem = 0;
		double power;
		double result = 0;
		int i = 0;
		while(n>0) {
			rem = n%10;
			power = Math.pow(2, i);
			result = result + (rem*power);
			n = n/10;
			i++;
		}
		System.out.print("The decimal number of equvivalent binary number is : " + (int)result);

	}

}
