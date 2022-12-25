package Geekster.PracticeSession;
import java.util.Scanner;

public class ReplaceEWithBInString {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		String s = userinput.next();
		char[] ch = s.toCharArray();
		
		for(int i = 0;i<s.length();i++) {
			if(ch[i] == 'e') {
				ch[i] = 'b';
			}
		}
		for(int i = 0;i<s.length();i++) {
			System.out.print(ch[i]);
		}
	}

}
