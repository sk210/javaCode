package Geekster.Week1;

public class MemoryLocation {

	public static void main(String[] args) {
		
		// how to write float value : 
		
		float flo = 1234.11123334f;
		System.out.println("The float value is : " + flo);
		
		// how to write double value : 
		
		double dou = 1234567.1111234567;
		System.out.println("The double value is : " + dou);
		
		// how to write character value : 
		
		char cha = 'K';
		System.out.println("The character value is : " + cha);
		
		// how to memory allocate in integer : 
		
		int num = 5;
		addValuenum(num);
		System.out.println(num);
		
		// how to memory allocate in array : 
		
		int[] arr = {1,2,3,4};
		addValuearr(arr);
		System.out.println(arr[2]);
		
	}
	
	public static void addValuenum(int a) {
		a = a + 10;

	}
	
	public static void addValuearr(int[] arr) {
		arr[2] = arr[2] + 10;
	}

}
