package Geekster.Week2;
import java.util.Scanner;

public class elseifMark {
	
	public static String Grade(int mark) {
		String grade;
		if(mark >= 90 && mark <=100) {
			grade = "A+";
		}
		else if(mark >= 80 && mark < 90) {
			grade = "A";
		}
		else if(mark >= 70 && mark<80) {
			grade = "B";
		}
		else if(mark >= 60 && mark < 70) {
			grade = "C";
		}
		else if(mark >= 50 && mark < 60) {
			grade = "D";
		}
		else if(mark<50 && mark >= 0) {
			grade = "Fail";
		}
		else {
			grade = "Invalid";
		}
		return grade;
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		char ch;
		do {
		
		System.out.print("Enter your marks : ");
		int mark = userinput.nextInt();
		System.out.print("your grade is : " + Grade(mark));
		
		System.out.println();
		System.out.println();
		
		System.out.print("Do you want to enter another marks(y/n) : ");
		ch = userinput.next().charAt(0);
		
		}while(ch == 'y' || ch == 'Y');

	}

}
