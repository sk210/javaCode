package Geekster.PracticeSession;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {2,4,5,6,6,8,9};
		
		for(int i = 1;i<=9;i++) {
			boolean bool = false;
			for(int j = 0;j<arr.length;j++) {
				if(arr[j] == i) {
					bool = true;
					break;
				}
			}
			if(bool == false) {
				System.out.println("missing number is : " + i);
			}
		}
		

	}

}
