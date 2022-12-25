package Geekster.PracticeSession;

public class ReverseTheNumber {

	public static void main(String[] args) {
		long number = 567893456;
		int result = 0;
		while(number != 0) {
			result = (result*10) + (int)(number%10);
			number = number/10;
		}
		System.out.println(result);

	}

}
