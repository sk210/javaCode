package Week1;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter your Age : ");
		int age = userinput.nextInt();
		System.out.print("Enter your Weight : ");
		int weight = userinput.nextInt();
		
		if(age>18) {
			if(weight > 60) {
				System.out.println("You can Donate blood");
			}
			else {
				System.out.println("Your Weight is less to donate blood");
			}
		}
		else {
			System.out.println("Your age is less to donate blood,minimum age required is 18 to donate blood");
		}
	}

}
