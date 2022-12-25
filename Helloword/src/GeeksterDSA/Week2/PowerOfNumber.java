package GeeksterDSA.Week2;
import java.util.Scanner;

public class PowerOfNumber {
	
	public static int PowerOfNumber(int number,int power) {
		if(power == 0) {
			return 1;
		}
		
		return number*PowerOfNumber(number,power-1);
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		int number = userinput.nextInt();
		int power = userinput.nextInt();
		
		int result = PowerOfNumber(number,power);
		System.out.println(result);

	}

}
