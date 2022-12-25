package GeeksterDSA.Week1;

public class KthLargetNumber {

	public static void main(String[] args) {
		 int[] arr= {67,45,23,89,3,5,77,99};

	        

	        for(int i=0;i<arr.length-1;i++) {
	            for(int j=0;j<arr.length-i-1;j++) {

	                if(arr[j]>arr[j+1]) {
	                    int temp=arr[j];
	                    arr[j]=arr[j+1];
	                    arr[j+1]=temp;
	                }

	            }
	        }

	        System.out.println("kth small value : "+ arr[0]);
	        System.out.println("kth large value is : "+ arr[arr.length-1]);
	}

}
