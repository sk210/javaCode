package Week1;
import java.util.Scanner;

public class SwitchStstement {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int num1 = userinput.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = userinput.nextInt();
		
		System.out.print("Enter your Operation : ");
		char ch = userinput.next().charAt(0);
		
		int ans = 0;
		
		switch(ch) {
		case '+' : ans = num1 + num2;
					System.out.println("Your ans is " + ans);
					break;
		case '-' : ans = num1 - num2;
					System.out.println("Your ans is " + ans);
					break;
		case '*' : ans = num1 * num2;
					System.out.println("Your ans is " + ans);
					break;
		case '/' : ans = num1/num2;
					System.out.println("Your ans is " + ans);
					break;
		case '%' : ans = num1%num2;
					System.out.println("Your ans is " + ans);
					break;
		default : System.out.println("You Enter Invalid Operator");
					
		}
		
	}

}
