package Geekster.Week2;
import java.util.Scanner;

public class intMaxvalueByMethod {
	
	public static void maxvalue(int i,int j,int k) {
		
		 if(i == j) {
			if(i>k) {
				System.out.println("first and second integer have equal and maximum value");
			}
			else {
				System.out.println("third integer have maximum value");
			}
		}
		else if(i == k) {
			if(i>j) {
				System.out.println("first and third integer have equal and maximum value");
			}
			else {
				System.out.println("third integer have maximum value");
			}
		}
		else if(j == k) {
			if(j>i) {
				System.out.println("second and third integer have equal and maximumvalue");
			}
			else {
				System.out.println("first interger have maximum value");
			}
		}
		else if(i>j) {
			if(i > k) {
				System.out.println("first integer have maximum value");
			}
			else {
				System.out.println("third integer have maximum value");
			}
		}
		else if(j>i) {
			if(j>k) {
				System.out.println("second integer have maximum value");
			}
			else {
				System.out.println("third integer have maximum value");
			}
		}
		else if(k>i) {
			if(k>j) {
				System.out.println("third integer have maximum value");
			}
			else {
				System.out.println("second integer have maximum value");
			}
		}
		else {
			System.out.println("three of three intger value are equal");
		}
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter the first integer number : ");
		int i = userinput.nextInt();
		
		System.out.print("Enter the second integer number : ");
		int j = userinput.nextInt();
		
		System.out.print("Enter the third integer number : ");
		int k = userinput.nextInt();
		
		System.out.println();
		maxvalue(i,j,k);
		
		

	}

}
