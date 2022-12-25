package GeeksterDSA.Week1;

public class CellingAndFloar2 {

	public static void main(String[] args) {
		int[] arr = {10,15,25,42,61,90,103};
		int s = 0;
		int e = arr.length-1;
		int m = 0;
		int target = 102;
//		int floar = 0;
//		int celling = 0;
		
		while(s<=e) {
			m = s + ((e-s)/2);
			if(arr[m] == target) {
				System.out.print(arr[m]);
				break;
			}
			else if(target<arr[m]) {
				e = m-1;
			}
			else {
				s = m+1;
			}
		}
		System.out.println(arr[s]);
		System.out.println(arr[e]);

	}

}
