package GeeksterDSA.Week2;

public class Digonal {

	public static void main(String[] args) {
		int[][] arr = {{1,2,5},{7,8,10},{9,7,12}};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(i+j == arr.length-1) {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
