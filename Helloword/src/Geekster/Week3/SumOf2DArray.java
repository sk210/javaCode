package Geekster.Week3;
import java.util.Scanner;

public class SumOf2DArray {
	
	public static int[][] SumOf2DArray(int[][] arr1,int[][] arr2) {
		int[][] result = new int[arr1.length][arr1[0].length];
		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
		for(int i = 0;i<arr1.length;i++) {
			for(int j = 0;j<arr1[i].length;j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		  }
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the row for first Array  : ");
		int n1 = userinput.nextInt();
		System.out.print("Enter the column for first Array  : ");
		int m1 = userinput.nextInt();
		
		System.out.print("Enter the elment for the first Array : ");
		int[][] arr1 = new int[n1][m1];
		for(int i = 0;i<n1;i++) {
			for (int j = 0;j<m1;j++) {
				arr1[i][j] = userinput.nextInt();
			}
		}
		
		System.out.print("Enter the row for second Array: ");
		int n2 = userinput.nextInt();
		System.out.print("Enter the column for second Array : ");
		int m2 = userinput.nextInt();
		
		if(n1 == n2 && m1 == m2) {
		System.out.print("Enter the elment for the second Array : ");
		int[][] arr2 = new int[n2][m2];
		for(int i = 0;i<n2;i++) {
			for (int j = 0;j<m2;j++) {
				arr2[i][j] = userinput.nextInt();
			}
		}
		
		int[][] SumOfArray = SumOf2DArray(arr1,arr2);
		
		System.out.println("your sum of Array is : ");
		for(int i = 0;i<n1;i++) {
			for(int j = 0;j<m1;j++) {
				System.out.print(SumOfArray[i][j] + " \t");
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Your first Array and second Array rows and columans value are not same");
		}

	}

}
