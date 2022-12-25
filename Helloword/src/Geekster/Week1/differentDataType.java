package Geekster.Week1;
import java.util.Scanner;

public class differentDataType {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		// Enter integer value : 
		System.out.print("Enter the value in integer : ");
		int i = userinput.nextInt();
		
		System.out.println();
		
		// Enter double value : 
		System.out.print("Enter the value in double : ");
		double j = userinput.nextDouble();
		
		System.out.println();
		
		// Enter character value : 
		System.out.print("enter the value in character : ");
		char k = userinput.next().charAt(0);
		
		System.out.println();
		
		// Print all value are given by user : 
		System.out.println("The value of integer is : " + i);
		System.out.println("The value of double is : " + j);
		System.out.println("The value of character is : " + k);
		

	}

}
