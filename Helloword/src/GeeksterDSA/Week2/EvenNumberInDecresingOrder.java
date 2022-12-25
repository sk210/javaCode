package GeeksterDSA.Week2;
import java.util.Scanner;

public class EvenNumberInDecresingOrder {
	
	public static void EvenNumberDecresing(int number) {
		if(number == 0) {
			return;
		}
		if(number%2 == 0) {
			System.out.print(number + " ");
			EvenNumberDecresing(number-2);
		}else {
			EvenNumberDecresing(number-1);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		int number = userinput.nextInt();
		EvenNumberDecresing(number);

	}

}
