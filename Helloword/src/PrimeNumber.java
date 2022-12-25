
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 7;
		int cout = 0;
		for(int i = 1;i<=num;i++) {
			if(num % i == 0) {
				cout = cout+1;
			}
		}
		if(cout == 2) {
			System.out.println( num + " Number is Prime");
		}
		else {
			System.out.println( num + " Number is Not Prime");
		}

	}

}
