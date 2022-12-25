
public class Palindrome {

	public static void main(String[] args) {
		int n = 123454321;
		int temp,sum=0;
		temp = n;
		while(n!=0) {
			sum = (sum*10) + n%10;
			n = n/10;
		}
		if(sum == temp) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is Not Palindrome");
		}

	}

}
