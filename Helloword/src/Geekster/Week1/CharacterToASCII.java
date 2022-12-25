package Geekster.Week1;
import java.util.Scanner;

public class CharacterToASCII {

	public static void main(String[] args) {
		int num;
		
		Scanner userinput = new Scanner(System.in);
		
		// Give value as a character : 
		System.out.print("Enter The value in character : ");
		char ch = userinput.next().charAt(0);
		
		// convert character value in ASCII value : 
		num = (int)ch;
		
		System.out.println();
		
		// Print ASCII value : 
		System.out.println("The ASCII value for given Character is : " + num);

	}

}
