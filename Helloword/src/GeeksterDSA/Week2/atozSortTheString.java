package GeeksterDSA.Week2;

public class atozSortTheString {
	
	public static void SortTheString(String s,int[] arr) {
		
		for(int i = 0;i<s.length();i++) {
			arr[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > 0) {
				for(int j = 0;j<arr[i];arr[i]--) {
					System.out.print((char)(i + 'a' ));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		String s = "ajidrgjjdfnzsacvhj";
		int[] arr = new int[26];
		
		SortTheString(s,arr);

	}

}
