package Geekster.PracticeSession;
import java.util.Scanner;

public class ReverseCharArray {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		String s = userinput.nextLine();
//		char[] c = {'h','e','l','l','o',' ','w'};
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		char sot;
		while(i<j) {
			sot = ch[i];
			ch[i] = ch[j];
			ch[j] = sot;
			i++;
			j--;
		}
		
		for(int k = 0;k<ch.length;k++) {
			System.out.print(ch[k]);
		}

	}

}
