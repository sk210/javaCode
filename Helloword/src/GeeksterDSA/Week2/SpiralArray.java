package GeeksterDSA.Week2;

public class SpiralArray {

	public static void main(String[] args) {
		int[][] arr = {{1,4,5,7,10},{12,56,13,4,6},{3,8,9,20,22},{12,13,4,5,7}};
		int top = 0;
		int right = arr[0].length-1;
		int left = 0;
		int bottom = arr.length - 1;
		
		int direction = 0;
		
		while(top <= bottom && left <= right) {
			if(direction == 0) {
				for(int i = left;i<=right;i++) {
					System.out.print(arr[top][i] + " ");
				}
				top++;
				direction = 1;
			}
			if(direction == 1) {
				for(int i = top;i<=bottom;i++) {
					System.out.print(arr[i][right] + " ");
				}
				right--;
				direction = 2;
			}
			if(direction == 2) {
				for(int i = right;i >= left;i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
				direction = 3;
			}
			if(direction == 3) {
				for(int i = bottom;i >= top;i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
				direction = 0;
			}
		}

	}

}
