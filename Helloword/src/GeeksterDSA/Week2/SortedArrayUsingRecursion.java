package GeeksterDSA.Week2;

public class SortedArrayUsingRecursion {
	
	static int[] arr= {1,3,5,7,6,9,10,12}; 
	public static boolean SortedArray(int index) {
		if(index == arr.length-1) {
			return true;
		}
		if(arr[index] <= arr[index+1]) {
			return SortedArray(index+1);
		}
		else return false;
		

		
	}

	public static void main(String[] args) {
		
		
		System.out.println(SortedArray(0));

	}

}
