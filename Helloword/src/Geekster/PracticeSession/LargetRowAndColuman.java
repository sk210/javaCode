package Geekster.PracticeSession;
import java.util.Scanner;

public class LargetRowAndColuman {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int n = userinput.nextInt();
		int m = userinput.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				arr[i][j] = userinput.nextInt();
			}
		}
//		for(int i = 0;i<n;i++) {
//			for(int j = 0;j<m;j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
		int sum = 0;
		int sum2 = sum;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				sum = sum + arr[j][i];
			}
			if(sum < sum2) {
				sum2 = sum;
			}
		}

	}

}
