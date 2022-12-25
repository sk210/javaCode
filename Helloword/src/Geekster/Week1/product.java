package Geekster.Week1;
import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		double product;
		
		// Enter The value in integer : 
		System.out.print("Enter the value in integer : ");
		int i = userinput.nextInt();
		
		// Enter The value in double :
		System.out.print("Enter the value in double : ");
		double d = userinput.nextDouble();
		
		// Product of integer and double :
		product = i*d;
		
		System.out.println();
		System.out.println("The product of integer And double is : " + product);
		

	}

}
