package Geekster.PracticeSession;
import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = userinput.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			if(ch>='a' && ch <= 'z') {
				char up = (char)('A'+ ch - 'a');
				sb.setCharAt(i, up);
			}
			else if(ch>='A' && ch <= 'Z') {
				char low = (char)('a'+ ch - 'A');
				sb.setCharAt(i, low);
			}
		}
		
		System.out.println(sb.toString());

	}

}
