package Geekster.Week3;
import java.util.Scanner;

public class FirstCharacterInUppercase {
	
	public static String Uppercase(String str) {
		String result = "";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			if(i == 0) {
				result = result + Character.toUpperCase(ch[i]); 
			}
			else if(ch[i] == ' ') {
				result = result + ch[i];
				i = i+1;
				result = result + Character.toUpperCase(ch[i]);
			}
			else {
				result = result + ch[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = userinput.nextLine();
		
		System.out.println("Your updated String is : " + Uppercase(str));
		
		userinput.close();
	}

}
