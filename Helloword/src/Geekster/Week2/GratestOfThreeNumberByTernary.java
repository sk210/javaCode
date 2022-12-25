package Geekster.Week2;
import java.util.Scanner;

public class GratestOfThreeNumberByTernary {
	
	public static int gratestByTernary(int a,int b,int c) {
		int i = (a>b) ? (a>c)? a : c : (b>c)? b : c ;
		return i;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the first integer number : ");
		int a = userinput.nextInt();
		
		System.out.print("Enter the second integer number : ");
		int b = userinput.nextInt();
		
		System.out.print("Enter the third integer number : ");
		int c = userinput.nextInt();
		
		System.out.print("Gratest number is : " + gratestByTernary(a,b,c));


	}

}
