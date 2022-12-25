package Geekster.Week3;

public class IndexOfArrays {

	public static void main(String[] args) {
		int[] num = {4,2,6,12,34,2,8,53,15};
		boolean result = false;
		int index = -1;
		for(int i = 0;i<num.length;i++) {
			if(num[i] == 2) {
				result = true;
				index = i;
			}
		}
		System.out.println(result);
		System.out.println(index);

	}

}
