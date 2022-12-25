package Geekster.Week3;
import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the row for Array : ");
		int n = userinput.nextInt();
		System.out.print("Enter the column for Array : ");
		int m = userinput.nextInt();
		System.out.print("Enter the elment for the Array : ");
		int[][] arr = new int[n][m];
		for(int i = 0;i<n;i++) {
			for (int j = 0;j<m;j++) {
				arr[i][j] = userinput.nextInt();
			}
		}
		
		int zero = 0;
		int number = 0;
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(arr[i][j] == 0) {
					zero++;
				}
				else {
					number++;
				}
			}
		}
		
		if(zero>number) {
			System.out.println("your Matrix is sparse matrix");
		}
		else {
			System.out.println("your Matrix is not sparse matrix");
		}
		
		userinput.close();

	}

}
