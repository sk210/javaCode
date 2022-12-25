package Geekster.Week2;
import java.util.Scanner;

public class countHowManyDigitInNumber {
	
	public static String countNumberOfDigit(long l) {
		int count = 0;
		String s = "";
		
		while(l > 0) {
			l = l/10;
			count++;
		}
		if(count == 1) {
			s = "Your entered number is 1 digit";
		}
		else if(count == 2) {
			s = "Your entered number is 2 digit";
		}
		else if(count == 3) {
			s = "Your entered number is 3 digit";
		}
		else if(count == 4) {
			s = "Your entered number is 4 digit";
		}
		else if(count == 5) {
			s = "Your entered number is 5 digit";
		}
		else {
			s = "Your entered number is more than 5 digit";
		}
		
		return s;
	}

	public static void main(String[] args) {
	Scanner userinput = new Scanner(System.in);
	char ch;
	do {
	System.out.print("Enter the number : ");
	long l = userinput.nextLong();
	System.out.println(countNumberOfDigit(l));
	System.out.println();
	System.out.print("Do you want to continue(y/n) :");
	ch = userinput.next().charAt(0);
	}while(ch == 'y' || ch == 'Y');
	
	}

}
