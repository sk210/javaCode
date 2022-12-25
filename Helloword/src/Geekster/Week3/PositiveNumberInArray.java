package Geekster.Week3;
import java.util.Scanner;

public class PositiveNumberInArray {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("enter 10 numbers for array : ");
		int[] arr = new int[10];
		int j;
		int n;
		for(int i = 0;i<arr.length;i++) {
			j = userinput.nextInt();
			arr[i] = j;
		}
		
		for(int i = 0;i<arr.length;i++) {
			n = arr[i];
			if(n>0) {
				System.out.print(i+1 + " positive number is : " + n);
			}
			System.out.println();
		}
		
	}

}
