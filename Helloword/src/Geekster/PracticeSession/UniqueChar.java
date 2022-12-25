package Geekster.PracticeSession;

public class UniqueChar {

	public static void main(String[] args) {
		String s = "{123@#abcd!&}";
		int j = s.length() - 1;
		String result = "";
//		while(i<j) {
//			if(s.charAt(i) < 'a' && s.charAt(i) > 'z') {
//				i++;
//			}
//			if(s.charAt(j) < 'a' && s.charAt(j) > 'z') {
//				j--;
//				
//			}
//			if(s.charAt(i) > 'a' && s.charAt(i) < 'z' && s.charAt(j) < 'a' && s.charAt(j) > 'z') {
//				
//				
//			}
//		}
		
		
		for(;j>=0;j--) {
			if(s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
				result = result + s.charAt(j);
			}
		}
		System.out.println(result);
	}

}
