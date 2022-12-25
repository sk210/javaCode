package Geekster.Week2;
import java.util.Scanner;

public class int_float_double_multiplication {
	
	public static double int_float_double_multiply(int i,float f,double d) {
		double dou;
		dou = i*f*d;
		return dou;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the integer number : ");
		int i = userinput.nextInt();
		
		System.out.print("Enter the float number : ");
		float f = userinput.nextFloat();
		
		System.out.print("Enter the double number : ");
		double d = userinput.nextDouble();
		
		System.out.println();
		
		System.out.println("your int_float_double multiplication value is : " + int_float_double_multiply(i,f,d));

	}

}
