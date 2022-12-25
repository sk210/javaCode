package Geekster.Week3;
import java.util.Scanner;

public class OddAndEvenNumberInMatrix {

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
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[i][j]%2 == 0) {
					even++;
				}
				else {
					odd++;
				}
			}
		}
		
		System.out.println("Even number in your matrix is : " + even);
		System.out.println("Odd number in your matrix is : " + odd);
		
		userinput.close();
	}

}
