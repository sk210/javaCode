package GeeksterDSA.Week3;

public class CumaltiveSum {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7};
		int[] cum = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			int sum = 0;
			for(int j = i;j>=0;j--) {
				sum = sum + j;
			}
			cum[i] = sum;
		}
		
		for(int i = 0;i<cum.length;i++) {
			System.out.println(cum[i]);
		}

	}

}
