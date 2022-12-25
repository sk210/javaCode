package GeeksterDSA.Week2;

public class SumOfNumber {
	
	static int number= 435678;
	static int result = 0;
	
	public static void SumOfNumber(){
		if(number == 0) {
			System.out.println(result);
			return;
		}else {
			result += number%10;
			number = number/10;
			SumOfNumber();
		}
		
	}

	public static void main(String[] args) {
		SumOfNumber();

	}

}
