package GeeksterDSA.Week2;

import java.util.Scanner;

public class FibbonaciSeries {
	
	static int t = 0;
	
	public static int FibonaciSeries(int number) {
		if(number == 0) {
			return 0;
		}
		
		if(number == 1) {
			return 1;
		}
		if(number == 2) {
			System.out.print(1 + " ");
		}
		
		t = FibonaciSeries(number-1) + FibonaciSeries(number-2);
		System.out.print(t + " ");
		return t;
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		int number = userinput.nextInt();
		
		FibonaciSeries(number);
		
		

	}

}
