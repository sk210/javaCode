package Week1;
import java.util.Scanner;

public class DowhileLoop {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = userinput.nextInt();
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
			if(i == 5) {
				System.out.println("your number is now 5");
				continue;
			}
		}while(i<=number);

	}

}
