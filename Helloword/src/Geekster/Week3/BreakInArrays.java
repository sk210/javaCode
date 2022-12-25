package Geekster.Week3;

public class BreakInArrays {

	public static void main(String[] args) {
		int[] num = {4,2,6,12,34,2,8,53,15};
		boolean result = false;
		for(int i = 0;i<num.length;i++) {
			if(num[i] == 2) {
				result = true;
				break;
			}
		}
		System.out.println(result);
	}

}
