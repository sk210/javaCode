package Geekster.Week3;
import java.util.Scanner;

public class SumOfDigonalValue {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the row for Array : ");
		int n = userinput.nextInt();
		System.out.print("Enter the column for Array : ");
		int m = userinput.nextInt();
		int sum = 0;
		int result = 0;
		
		System.out.print("Enter the elment for the Array : ");
		int[][] arr = new int[n][m];
		for(int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				arr[i][j] = userinput.nextInt();
			}
		}
		for(int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				if(i == j) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.print("The first Digonal Sum is : " + sum);
		System.out.println();
		
		for(int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				if(i+j == n-1) {
					result = result + arr[i][j];
				}
			}
		}
		System.out.print("The second digonal sum is : " + result);


	}

}
