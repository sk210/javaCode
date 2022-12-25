package Geekster.Week2;
import java.util.Scanner;

public class CourseByBranchAndYear {
	
	public static void Course(int i,String s) {
		if(i == 1) {
			if(s.equals("CSE") || s.equals("ECE") || s.equals("MECH")) {
				System.out.println("Your course is English,Maths,Science");
			}
			else {
				System.out.println("You entered wrong Branch");
			}
		}
		else if(i == 2) {
			if(s.equals("CSE")) {
				System.out.println("Your course is Operating System, Java, Data Structure");
			}
			else if(s.equals("ECE")) {
				System.out.println("Your course is Micro Processor, Logic Switching Theory");
			}
			else if(s.equals("MECH")) {
				System.out.println("Your course is Drawing, Manufacturing Machine");
			}
			else {
				System.out.println("You entered wrong Branch");
			}
		}
		else if(i == 3) {
			if(s.equals("CSE")) {
				System.out.println("Your course is Computer Organization, Multimedia");
			}
			else if(s.equals("ECE")) {
				System.out.println("Your course is Fundamentals Of Logic Design, Microelectronics");
			}
			else if(s.equals("MECH")) {
				System.out.println("Your course is Internal Combustion Engines, Mechanical Vibration");
			}
			else {
				System.out.println("You entered wrong Branch");
			}
		}
		else if(i == 4) {
			if(s.equals("CSE")) {
				System.out.println("Your course is Data Comunication and Networks, Multimedia");
			}
			else if(s.equals("ECE")) {
				System.out.println("Your course is Embedded System, Image Processing");
			}
			else if(s.equals("MECH")) {
				System.out.println("Your course is Production Technology, Thermal Engineering");
			}
			else {
				System.out.println("You entered wrong Branch");
			}
		}
		else {
			System.out.println("You entered wrong year");
		}
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		String s;
		
		System.out.print("Enter the year : ");
		int i = userinput.nextInt();
		System.out.print("Enter the Branch : ");
		s = userinput.next();
		
	    Course(i,s);
	    userinput.close();

	}

}
