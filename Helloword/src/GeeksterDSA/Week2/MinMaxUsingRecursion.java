package GeeksterDSA.Week2;



public class MinMaxUsingRecursion {
	
	static int[] result = new int[2];
	static int first = -1;
	static int last = -1;
	
	public static int[] FinMaxMin(int index,int[] arr) {
		if(index == arr.length-1) {
			result[0] = first;
			result[1] = last;
			return result;
		}
		if(first == -1 && last == -1) {
			first = arr[0];
			last = arr[0];
			FinMaxMin(index+1,arr);
		}
		if(first > arr[index]) {
			first = arr[index];
			
		}
		if(last<arr[index]) {
			last = arr[index];
		}
		return FinMaxMin(index+1,arr);
		
		
	}

	public static void main(String[] args) {
		
		
		int[] arr = {1,-1,0,2,-2,3,-3,4,-4};
		int[] result = FinMaxMin(0,arr);
		
		System.out.println(result[0] + " " + result[1]);

	}

}
