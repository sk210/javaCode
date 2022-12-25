package Geekster.PracticeSession;

import java.util.Scanner;

public class SubOfString {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = userinput.nextLine();
//		char[] ch = str.toCharArray();
		
//		for(int i = 0;i<str.length();i++) {
//			for(int j = i +1;j<str.length();j++) {
//				System.out.print(str.substring(i,j));
//				System.out.println();
//			}
//		}
		
		for(int i = 0;i<str.length();i++) {
			String sub = " ";
			for(int j = i;j<str.length();j++) {
				sub = sub + str.charAt(j);
				System.out.println(sub);
			}
		}
		
	}

}
