package Geekster.Week2;
import java.util.Scanner;

public class ifelse {
	
	public static void vote(int age) {
		if(age>18) {
			System.out.println("you are eligable for vote ");
		}else {
			System.out.println("you are not eligable for vote ");
		}
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = userinput.nextInt();
		
		vote(age);

	}

}
