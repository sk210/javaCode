package Geekster.PracticeSession;
import java.util.Scanner;

public class ReplaceWith100 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int n = userinput.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = userinput.nextInt();
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > 100) {
				arr = new int[n+1];
				arr[i] = 100;
				int temp = arr[i+1];
				arr[i+1] = 100;
				arr[i+2] = temp;
				
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
