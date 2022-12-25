package Geekster.PracticeSession;

public class CountOfCharArray {

	public static void main(String[] args) {
		char[] arr = {'a','g','h','g','a'};
		for(int i = 0;i<arr.length;i++) {
			int count = 0;
			for(int j = 0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.print(arr[i] + " -" + count);
			System.out.println();
		}

	}

}
