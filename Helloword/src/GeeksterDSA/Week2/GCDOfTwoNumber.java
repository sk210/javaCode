package GeeksterDSA.Week2;

public class GCDOfTwoNumber {
	
	static int t = 0;
	
	public static int GCD(int FirstNumber,int SecondNumber) {
		
		if(SecondNumber == 0) {
			return FirstNumber;
		}else if(FirstNumber>SecondNumber) {
			return SecondNumber;
		}
		else {
			return (GCD(FirstNumber,SecondNumber%FirstNumber));
			
		}
	}

	public static void main(String[] args) {
		
		int t = GCD(4,8);
		System.out.println(t);

	}

}
