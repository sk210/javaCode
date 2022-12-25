package Geekster.PracticeSession;

public class InfiniteArray {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,11,21,31,45};
		int low = 0;
		int high = 1;
		int target = 21;
		int mid = 0;
		while(arr[high] < target) {
			low = high;
			high = 2*high;
			if(high < arr.length) {
				continue;
			}else {
				high = arr.length;
				break;
			}
		}
		while(low<high) {
			mid = low + ((high - low)/2);
			if(mid<target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		System.out.println(mid);

	}

}
