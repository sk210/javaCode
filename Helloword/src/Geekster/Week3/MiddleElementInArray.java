package Geekster.Week3;
import java.util.Scanner;

public class MiddleElementInArray {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("enter 10 numbers for array : ");
		int[] arr = new int[10];
		int j;
		int n = arr.length;
		int m;

		for(int i = 0;i<arr.length;i++) {
			j = userinput.nextInt();
			arr[i] = j;
		}
	
		m = (arr[n/2 - 1] + arr[n/2])/2;
		System.out.print("The midden element of Array is : " + m);
	}

}
