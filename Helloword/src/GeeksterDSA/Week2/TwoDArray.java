package GeeksterDSA.Week2;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,5,6},{7,8,10,11},{5,7,12,5}};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
