package Geekster.Week1;
import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		// using for loop print table of number 
		System.out.println("using for loop print table of number");
		System.out.println();
		System.out.print("Enter the number : ");
		int number = userinput.nextInt();
		int multiple;
		for(int i = 1;i<=10;i++) {
			multiple = number*i;
			System.out.println(number + " * " + i +  " = " + multiple);
		}
		
		System.out.println();
		System.out.println();
		
		// using while loop print table of number
		System.out.println("using while loop print table of number");
		System.out.println();
		System.out.print("Enter the number : ");
		int num = userinput.nextInt();
		int multi;
		
		int j = 1;
		while(j<=10) {
			multi = num * j;
			System.out.println(num + " * " + j + " = " + multi);
			j++;
		}
		

	}

}
