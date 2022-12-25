package GeeksterDSA.Week2;

public class AverageElementOfArray {
	
	public static int AverageOfArray(int[] arr,int result,int index) {
		
		if(index == arr.length) {
			 return result/2;
		}
		
		result = result + arr[index];
		return AverageOfArray(arr,result,index+1);
		
	}

	public static void main(String[] args) {
		
		int[] arr = {3,7,21,46,87,23,2,4,7,9};
		int result = 0;
		int index = 0;
		
		System.out.println(AverageOfArray(arr,result,index));
		

	}

}
