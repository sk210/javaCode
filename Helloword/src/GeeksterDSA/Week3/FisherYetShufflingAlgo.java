package GeeksterDSA.Week3;
import java.util.Random;

public class FisherYetShufflingAlgo {
	
	public static int[] Shuffling(int[] arr) {
		
		Random rnd = new Random();
		for(int i = arr.length - 1;i>0;i--) {
			int index = rnd.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = arr[i];
					
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Shuffling(arr);
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
