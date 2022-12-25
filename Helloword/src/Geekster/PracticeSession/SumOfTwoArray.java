package Geekster.PracticeSession;
import java.util.Scanner;

public class SumOfTwoArray {
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int n = userinput.nextInt();
		int[] arr1 = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr1[i] = userinput.nextInt();
		}
		
		int m = userinput.nextInt();
		int[] arr2 = new int[m];
		int k = 0;
		int temp = 0;
		while(n>m) {
			arr2 = new int[n];
		}
		for(int i = n-m;i<n;i++) {
			arr2[i] = userinput.nextInt();
		}
		
		int[] result = new int[n];
		
		
		if(n == m) {
			for(int i = 0;i<n;i++) {
				result[i] = arr1[i] + arr2[i];
			}
		}
		else {
			
			for(int j = 0;j<n;j++) {
				result[j] = arr1[j] + arr2[j];
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.print(result[i] + " ");
		}
	}

}
