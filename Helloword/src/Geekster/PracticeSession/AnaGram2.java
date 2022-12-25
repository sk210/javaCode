package Geekster.PracticeSession;

import java.util.Arrays;

public class AnaGram2 {

	public static boolean isAnagram(String s, String t) {

		boolean bool = true;
		char[] ch = s.toCharArray();
		char[] ch1 = t.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);

		if (s.length() == t.length()) {
			for (int i = 0; i < s.length(); i++) {

				if (ch[i] == ch1[i]) {
					bool = true;
				} else {
					bool = false;
					break;
				}
			}
		}

		return bool;

	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		System.out.println(isAnagram(s, t));

	}

}
