package Week1;
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter your Ennrolment Number : ");
		long Ennrolment = userinput.nextLong();
		
		System.out.print("Enter your Name : ");
		String Name = userinput.next();
		
		System.out.print("Enter your Maths Marks : ");
		int Maths = userinput.nextInt();
		
		System.out.print("Enter your Physics Marks : ");
		int Physics = userinput.nextInt();
		
		System.out.print("Enter your Chemestry Marks : ");
		int Chemestry = userinput.nextInt();
		
		System.out.print("Enter your DataStructure Marks : ");
		int DataStructure = userinput.nextInt();
		
		System.out.print("Enter your Database Marks : ");
		int Database = userinput.nextInt();
		
		int TotalMarks = Maths + Physics + Chemestry + DataStructure + Database;
		float Percentage = (float)((TotalMarks)*100)/500;
		
		if(Percentage > 90) {
			System.out.println("Your grade is A & " + "Your mark is " + TotalMarks + " & Your Percentage is " + Percentage + "%");
		}
		else if(Percentage <= 90 && Percentage > 80) {
			System.out.println("Your grade is B & " + "Your mark is " + TotalMarks + " & Your Percentage is " + Percentage + "%");
		}
		else if(Percentage <= 80 && Percentage > 70) {
			System.out.println("Your grade is C & " + "Your mark is " + TotalMarks + " & Your Percentage is " + Percentage + "%");
		}
		else if(Percentage <= 70 && Percentage > 60) {
			System.out.println("Your grade is D & " + "Your mark is " + TotalMarks + " & Your Percentage is " + Percentage + "%");
		}
		else if(Percentage <= 60 && Percentage > 50) {
			System.out.println("Your grade is E & " + "Your mark is " + TotalMarks + " & Your Percentage is " + Percentage + "%");
		}
		else if(Percentage<35){
			System.out.println("You Are Fail");
		}
		else {
			System.out.println("Invalid number");
		}
		
	}

}
