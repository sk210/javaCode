package Geekster.Week3;
import java.util.Scanner;

public class SearchWordInsideString {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = userinput.nextLine();
		System.out.print("Enter the word you can find inside the string : ");
		String word = userinput.nextLine();
		boolean contains = str.contains(word);
		int index;
		if(contains) {
			index = str.indexOf(word);
			System.out.println("your entered word inside string and start index of " + index);
			
		}
		else {
			System.out.println("your entered word not inside the string");
		}

	}

}
