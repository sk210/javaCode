package Geekster.Week2;
import java.util.Scanner;

public class GratestOfTwoNumberByTernary {
	
	public static int gratestByTernary(int a,int b) {
		int i = (a>b) ? a : b;
		return i;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the first integer number : ");
		int a = userinput.nextInt();
		
		System.out.print("Enter the second integer number : ");
		int b = userinput.nextInt();
		
		System.out.print("Gratest number is : " + gratestByTernary(a,b));

	}

}
