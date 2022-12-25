package Geekster.Week2;
import java.util.Scanner;

public class int_float_long_multiplyByMethod {
	
	// Here we take in method two variables as a integer : 
	public static int multiply(int a,int b) {
		int result;
		result = a*b;
		return result;
	}
	
	// Here we take in method two variables as a float :
	public static float multiply(float a,float b) {
		float result;
		result = a*b;
		return result;
	}
	
	// Here we take in method two variables as a long :
	public static long multiply(long a,long b) {
		long result;
		result = a*b;
		return result;
	}
	
	// Here we take in method three variables as a integer,float and long :
	public static double multiply(int a,float b,long c) {
		double result;
		result = (a*c)*b;
		return result;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		char ch;
		
		do {
			
		// Here we ask to user which multiplication they can do : 	
		System.out.print("what method you can choose for multiply the value (1=>integer/2=>float/3=>long/4=>integer,float,long) : ");
		int i = userinput.nextInt();
		
		System.out.println();
		
		if(i==1) {
			System.out.print("Enter the first integer number : ");
			int a = userinput.nextInt();
			System.out.print("Enter the second integer number : ");
			int b = userinput.nextInt();
			System.out.print("your multiplication value is : " + multiply(a,b));
		}
		else if(i==2) {
			System.out.print("Enter the first float number : ");
			float a = userinput.nextFloat();
			System.out.print("Enter the second float number : ");
			float b = userinput.nextFloat();
			System.out.print("your multiplication value is : " + multiply(a,b));
		}
		else if(i==3) {
			System.out.print("Enter the first long number : ");
			long a = userinput.nextLong();
			System.out.print("Enter the second long number : ");
			long b = userinput.nextLong();
			System.out.print("your multiplication value is : " + multiply(a,b));
		}
		else if(i==4) {
			System.out.print("Enter the integer number : ");
			int a = userinput.nextInt();
			System.out.print("Enter the float number : ");
			float b = userinput.nextFloat();
			System.out.print("Enter the long number : ");
			long c = userinput.nextLong();
			System.out.print("your multiplication value is : " + multiply(a,b,c));
		}
		else {
			System.out.println("You press invalid key");
		}
		System.out.println();
		System.out.println();
		System.out.print("Do you want to continue multiplication(y/n) : ");
		ch = userinput.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');

	}

}
