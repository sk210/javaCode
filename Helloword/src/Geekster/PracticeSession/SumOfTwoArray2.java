package Geekster.PracticeSession;
import java.util.Scanner;

public class SumOfTwoArray2 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int n = userinput.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0;i<n;i++) {
			arr1[i] = userinput.nextInt();
		}
		int m = userinput.nextInt();
		int[] arr2 = new int[n];
		for(int i = 0;i<m;i++) {
			arr2[i] = userinput.nextInt();
		}
		int[] result = new int[n];
		if(n>m) {
			int j = 0;
			for(int i = 1;i<n-1;i++) {
				int temp = arr2[i];
				arr2[i] = arr2[j];
				arr2[j] = 0;
				arr2[i+1] = temp;
			}
		}
		
		for(int i = 0;i<n;i++) {
			result[i] = arr1[i] + arr2[i];
		}
		
		for(int i = 0;i<n;i++) {
			System.out.print(result[i] + " ");
		}
		
	}

}
