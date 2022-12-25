package Geekster.PracticeSession;
import java.util.*;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = userinput.nextInt();
		
		System.out.print("Enter the power : ");
		int b = userinput.nextInt();

		int result = 1;
		
		while(b>0) {
			if((b&1) == 1) {
				result *= a;
			}
			
			b = (b>>1);
			a = a*a;
		}
		System.out.println(result);

	}

}
