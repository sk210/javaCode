package Geekster.PracticeSession;

public class HcaseWithStringToInt {

	public static void main(String[] args) {
		String s = "-    1234";
		int a = 0;
		int i = 0;
		if(!(s.charAt(i) >= 48) && !(s.charAt(i) <= 57)) {
			i++;
		}
		while(s.charAt(i) == ' ') {
			i++;
		}
		for(;i<s.length();i++) {
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				a =(a*10) + (int)s.charAt(i) - '0';
			}
//			else {
//				System.out.println("you print wrong number");
//			}
		}
		System.out.println(a);

	}

}
