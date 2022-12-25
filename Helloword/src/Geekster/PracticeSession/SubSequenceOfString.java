package Geekster.PracticeSession;

public class SubSequenceOfString {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println(s.subSequence(0, s.length()));
		System.out.println(s.subSequence(0, s.length()-1));
		System.out.println(s.subSequence(0, s.length()));
		System.out.println(s.subSequence(1, s.length()));
	}

}
