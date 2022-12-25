package Geekster.Week3;

public class ReverseArrayUsingSameArray {

	public static void main(String[] args) {
		int[] num = {3,6,45,23,12,23,9,10};
		int i = 0;
		int j = num.length - 1;
		int temp;
		
		while(i<j) {
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			i++;
			j--;
		}
		
		for(int k = 0;k<num.length;k++) {
			System.out.println(num[k]);
		}

	}

}
