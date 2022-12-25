package GeeksterDSA.Week2;

public class BinarySearchUsingRecursion {
	
	public static int BinarySearchWithRecursion(int[] arr,int target,int start,int end) {
		
		if(start>end) {
			return -1;
		}
		
		int mid = start + ((end-start)/2);
		
		if(arr[mid] == target) {
			return mid;
		}
		
		if(arr[mid]>target) {
			end = mid - 1;
		}else {
			start = mid + 1;
		}
		return BinarySearchWithRecursion(arr,target,start,end);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,7,9,10,11};
		int target = 9;
		int start = 0;
		int end = arr.length - 1;
		
		System.out.println(BinarySearchWithRecursion(arr,target,start,end));
		

	}

}
