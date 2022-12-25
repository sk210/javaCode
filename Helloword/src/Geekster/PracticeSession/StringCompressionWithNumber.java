package Geekster.PracticeSession;
import java.util.Scanner;

public class StringCompressionWithNumber {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = userinput.nextLine();
		char[] ch = str.toCharArray();
		int i = 1;
		int count = 1;
		for(;i<ch.length;i++) {
			
			if(ch[i] == ch[i-1]) {
				count++;
			}
			if(ch[i] != ch[i-1]) {
				System.out.print(ch[i-1]);
				System.out.print(count);
				count = 1;
			}
			
		}
		
	}

}
