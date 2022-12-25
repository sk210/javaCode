package Geekster.PracticeSession;

public class LeaderOfNumber {

	public static void main(String[] args) {
		int[] arr = {5,4,6,7,8,9,3,6};
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i-1] <= arr[i]) {
				arr[i-1] = -1;
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
