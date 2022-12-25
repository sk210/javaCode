package Geekster.PracticeSession;
import java.util.Scanner;

public class StringIsPalindrome {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String Str = userinput.nextLine();
		int k = 0;
		int l = Str.length()-1;
		boolean bool = true;
		
		while(k<l) {
			if(Str.charAt(k) == Str.charAt(l)) {
				bool = true;
				k++;
				l--;
			}
			else {
				bool = false;
				break;
			}
		}
		
		if(bool) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		

	}

}
