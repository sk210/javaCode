package Geekster.Week2;
import java.util.Scanner;

public class int_float_long_multiplication {
	
	public static int multiplication(int i) {
		return i;
	}
	
	public static float multiplication(float f) {
		return f;
	}
	
	public static long multiplication(long l) {
		return l;
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		double d;
		
		System.out.print("Enter the integer number : ");
		int i = userinput.nextInt();
		
		System.out.print("Enter the float number : ");
		float f = userinput.nextFloat();
		
		System.out.print("Enter the long number : ");
		long l = userinput.nextLong();
		
		System.out.println();
		
		d = multiplication(i)*multiplication(f)*multiplication(l);
		
		System.out.print("your int_float_long multiplication value is : " + d);
	}

}
