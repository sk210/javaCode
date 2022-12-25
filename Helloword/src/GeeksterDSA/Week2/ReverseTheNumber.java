package GeeksterDSA.Week2;

public class ReverseTheNumber {
	
	static int result = 0;
	public static int ReverseTheNumber(int number) {
		if(number == 0) {
			return result;
		}
		
		result = (result*10) + (number%10);
		return ReverseTheNumber(number/10);
		
		
	}

	public static void main(String[] args) {
		
		int number = 2447678;
		
		System.out.println(ReverseTheNumber(number));

	}

}
