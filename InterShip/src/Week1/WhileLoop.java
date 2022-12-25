package Week1;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = userinput.nextInt();
		
		int i = 1;
		while(i<=number) {
			System.out.println(i);
			i++;
			if(i > 5) {
				break;
			}
		}
		

	}

}
