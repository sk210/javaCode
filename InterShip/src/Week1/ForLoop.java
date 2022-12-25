package Week1;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = userinput.nextInt();
		
		for(int i = 1;i<=number;i++) {
			System.out.println(i);
		}

	}

}
