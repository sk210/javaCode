package GeeksterDSA.Week1;

public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length-1;
		int[] result = new int[2];
		while(start<=end) {
			
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
		}
        
        return result;
        
    }

	public static void main(String[] args) {
		
		int[] number = {2,7,11,15};
		int target = 9;
		
		int[] result = twoSum(number,target);
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
