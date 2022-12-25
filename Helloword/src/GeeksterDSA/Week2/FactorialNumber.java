package GeeksterDSA.Week2;
import java.util.Scanner;

public class FactorialNumber {
	
	public static int FactorialNumber(int number) {
		if(number == 0) {
			return 0;
		}
		
		if(number == 1) {
			return 1;
		}
		return number*FactorialNumber(number-1);
		
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int number = userinput.nextInt();
		
		System.out.println(FactorialNumber(number));
		

	}

}
