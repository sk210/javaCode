package Geekster.PracticeSession;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "1234";
		int a = 0;
		for(int i = 0;i<s.length();i++) {
			a =(a*10) + (int)s.charAt(i) - '0';
		}
		System.out.println(a);
	}

}
