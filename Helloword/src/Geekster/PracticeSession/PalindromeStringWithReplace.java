package Geekster.PracticeSession;

public class PalindromeStringWithReplace {

	public static void main(String[] args) {
		String str = "hi@ &*ih";
		str = str.replaceAll("[^A-Za-z0-9]", "");
//		System.out.println(str);
		boolean bool = true;
		int i = 0;
		int j = str.length() -1;
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				bool = true;
			}
			else {
				bool = false;
				break;
			}
			i++;
			j--;
		}
		if(bool) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
