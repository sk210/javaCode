package Geekster.PracticeSession;

public class CountE {

	public static void main(String[] args) {
		String str = "Geeks For Geeks";
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);

	}

}
