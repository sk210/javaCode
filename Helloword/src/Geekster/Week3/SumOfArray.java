package Geekster.Week3;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr1 = {2,5,6,4,12,23,16};
		int[] arr2 = {4,6,9,12,34,56,9};
		int[] result = new int[arr1.length];
		
		
		for(int i = 0;i<arr1.length;i++) {
			result[i] = arr1[i] + arr2[i];
		}
		
		for(int k = 0;k<result.length;k++) {
			System.out.println(result[k]);
		}


	}

}
