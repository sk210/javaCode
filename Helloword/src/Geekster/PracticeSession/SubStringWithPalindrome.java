package Geekster.PracticeSession;
import java.util.Scanner;

public class SubStringWithPalindrome {
	
	public static void palindrome(String Str) {
		int k = 0;
		int l = Str.length()-1;
		boolean bool = true;
		
		while(k<l) {
			if(Str.charAt(k) == Str.charAt(l)) {
				bool = true;
				
			}
			else {
				bool = false;
				break;
			}
			k++;
			l--;
		}
		
		if(bool) {
			System.out.println(" \tString is Palindrome");
		}
		else {
			System.out.println("\tString is not Palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = userinput.nextLine();
//		char[] ch = str.toCharArray();
		
		for(int i = 0;i<str.length();i++) {
			String sub = "";
			for(int j = i;j<str.length();j++) {
				sub = sub + str.charAt(j);
				System.out.print(sub);
				palindrome(sub);
				
				
			}
			
		}

	}


}
