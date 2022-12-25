package GeeksterDSA.Week1;

public class SumOfInArray {

	public static void main(String[] args) {
		int[] numbers = {-3,3,4,90};
		int target = 9;
		int start = 0;
		int end = numbers.length-1;
		int mid = 0;
		int[] result = new int[2];
		while(start<=end) {
			mid = start + ((end - start)/2);
			if(numbers[start] + numbers[end] == target) {
				result[0] = start + 1;
				result[1] = end + 1;
				break;
			}
			else if(numbers[start] + numbers[end] < target) {
				start = start+1;
			}
			else {
				end = end - 1;
			}
			if(numbers[mid]>target) {
				end = mid - 1;
			}
		}
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
