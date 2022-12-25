package Geekster.Week3;

public class ReverseArrayUsingAnotheArray {

	public static void main(String[] args) {
		int[] num = {3,6,45,23,12,23,9,10};
		int[] arr= new int[num.length]; 
		
		int j = num.length - 1;
		for(int i = 0;i<arr.length;i++) {
			arr[i] = num[j];
			j--;
		}
		
		for(int k = 0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}

	}

}
