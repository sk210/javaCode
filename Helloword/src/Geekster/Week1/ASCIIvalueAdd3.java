package Geekster.Week1;
import java.util.Scanner;

public class ASCIIvalueAdd3 {

	public static void main(String[] args) {
		int num;
		
		Scanner userinput = new Scanner(System.in);
		
		// Give value as character : 
		System.out.print("Enter The value in character : ");
		char ch = userinput.next().charAt(0);
		
		// convert into character to integer : 
		num = (int)ch;
		num = num + 3;
		
		System.out.println();
		
		// Print integer value as a character : 
		System.out.println("The converted character is : " + (char)num);

	}

}
