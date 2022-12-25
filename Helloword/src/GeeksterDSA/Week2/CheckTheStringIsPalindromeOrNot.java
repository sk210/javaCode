package GeeksterDSA.Week2;
import java.util.Scanner;

public class CheckTheStringIsPalindromeOrNot {
	
	static String result = "";
	
	public static String ReverseString(String s,int index) {
		if(index == s.length()) {
			return result;
		}
		
		result = s.charAt(index) + result;
		return ReverseString(s,index+1);
	}
	
	public static void CheckPalindrome(String s,int index) {
		if(index == s.length()) {
			System.out.println("String Is Panlindrome");
			return;
		}
		if(s.charAt(index) == result.charAt(index)) {
			CheckPalindrome(s,index+1);
		}else {
			System.out.println("String Is Not Palindrome");
			return;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		String s = userinput.nextLine();
		
		ReverseString(s,0);
		
		CheckPalindrome(s,0);
		

	}

}
