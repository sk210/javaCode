package Geekster.PracticeSession;

import java.util.Scanner;

public class CheckArrayRotation {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		int n  = userinput.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for (int i = 0;i<n;i++) {
			arr[i] = userinput.nextInt();
		}
		for(int i = 1;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
		}
		System.out.print(count);


	}

}
