package Geekster.Week2;
import java.util.Scanner;

public class ArithmeticOperation {
	
	public static int operation(int a,char ch,int b) {
		int i = 0;
		
		switch(ch) {
		case '+' : 
			i = a+b;
			break;
		case '-' :
			i = a-b;
			break;
		case '*' : 
			i = a*b;
			break;
		case '/' :
			i = a/b;
			break;
		case '%' :
			i = a%b;
			break;
		default : 
			System.out.println("You entered wrong operation");
		}
		return i;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int a = userinput.nextInt();
		
		System.out.print("What operation you can do(+|-|*|/|%) : ");
		char ch = userinput.next().charAt(0);
		
		System.out.print("Enter the second number : ");
		int b = userinput.nextInt();
		
		System.out.print("Your value is : " + operation(a,ch,b));

	}

}
