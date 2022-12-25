package GeeksterDSA.Week1;

public class CelingAndFloring {

	public static void main(String[] args) {
		int[] arr = {10,15,25,42,61,90,103};
		int s = 0;
		int e = arr.length-1;
		int m = 0;
		int target = 103;
		int floar = 0;
		int celling = 0;
		
		while(s<=e) {
			m = s + ((e-s)/2);
			if(arr[m] == target && m != arr.length-1 && m != 0) {
				floar = arr[m-1];
				celling = arr[m+1];
				break;	
			}
			if(arr[m] == target && m != 0) {
				floar = arr[m-1];
				break;	
			}
			if(arr[m] == target && m != arr.length-1) {
				celling = arr[m+1];
				break;	
			}
			
			if(target<arr[m]) {
				e = m -1;
			}
			else {
				s = m+1;
			}
				
		}
		System.out.println(floar);
		System.out.println(celling);

	}

}
