package GeeksterDSA.Week2;

public class WaveArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,4,5,7,10},{12,56,13,4,6},{3,8,9,20,22},{12,13,4,5,7}};
		
		int length = 0;
		while(length<arr[0].length) {
			
			for(int i = 0;i<arr[0].length;i++) {
				if(length%2 == 0) {
					for(int j = 0;j<arr.length;j++) {
						System.out.print(arr[j][i] + " ");
					}
				}
				else {
					for(int j = arr.length-1;j>=0;j--) {
						System.out.print(arr[j][i] + " ");
					}
				}
				length = length+1;	
			}
			
		}
		

	}

}
