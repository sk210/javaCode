package Geekster.Week1;
import java.util.Scanner;

public class InchesToMeter {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		double meter;
		
		// Give value as a inches : 
		System.out.print("Enter the value in inches : ");
		double inches = userinput.nextDouble();
		
		System.out.println();
		
		// convert into inches to meter : 
		meter = inches/39.37;
		System.out.println("The value of meter is : " + meter);

	}

}
