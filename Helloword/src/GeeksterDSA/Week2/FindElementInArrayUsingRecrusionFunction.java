package GeeksterDSA.Week2;

public class FindElementInArrayUsingRecrusionFunction {
	
//	static int index = 0;
	public static int FindElement(int[] arr,int target,int index){
		
		if(arr[index] == -1) {
			return index;
		}
			
			FindElement(arr,target,index+1);
			return 0;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,3,9,-1};
		int target = -1;
		int index = 0;
		System.out.println(FindElement(arr,target,index));

	}

}
