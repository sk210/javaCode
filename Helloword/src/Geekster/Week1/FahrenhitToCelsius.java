package Geekster.Week1;
import java.util.Scanner;

public class FahrenhitToCelsius {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		double celsius;
		
		// Give value as a Fahrenhit : 
		System.out.print("Enetr The value in Fahrenhit : ");
		double fahrenhit = userinput.nextDouble();
		
		System.out.println();
		
		// convert into fahrenhit to celsius : 
		celsius = ((fahrenhit - 32)*5)/9;
		System.out.println("The value of Celsius is : " + celsius);

	}

}
