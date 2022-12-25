package GeeksterDSA.Week1;

public class SumOfNumberInArray {

	public static void main(String[] args) {
		int[] numbers = {2,4,5,11,15};
		int target = 9;
		int start = 0;
		int end = numbers.length-1;
		int[] result = new int[2];
		while(start<=end) {
			
			if(numbers[start] + numbers[end] == target) {
				result[0] = numbers[start];
				result[1] = numbers[end];
				break;
			}
			else if(numbers[start] + numbers[end] < target) {
				start = start+1;
			}
			else {
				end = end - 1;
			}
			
		}
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
