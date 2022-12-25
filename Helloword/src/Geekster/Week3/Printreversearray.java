package Geekster.Week3;

public class Printreversearray {

	public static void main(String[] args) {
		int[] num = {3,6,45,23,12,23,9,10};
		
		for(int i = num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}
