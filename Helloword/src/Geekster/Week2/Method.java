package Geekster.Week2;
import java.util.Scanner;

public class Method {
	
	
	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("The sum of two number is : " + add(5,4));
		System.out.println();
		
		System.out.println("The sum of two number is : " + add(5.34f,4.35f));
		System.out.println();
		
		System.out.println("The product of two number is : " + product(5,4));
		System.out.println();
		
		System.out.print("Enter the integer number : ");
		int k = userinput.nextInt();
		numbervalue(k);
		

	}
	static int add(int a,int b) {
		int result;
		result = a + b;
		return result;
	}
	
	static float add(float a,float b) {
		float result;
		result = a + b;
		return result;
	}
	
	static float product(int a,int b) {
		float result;
		result = a * b;
		return result;
	}
	
	static void numbervalue(int k) {
		if(k>0) {
			System.out.println("number is positive");
		}
		else if(k<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is zero");
		}
	}

}
