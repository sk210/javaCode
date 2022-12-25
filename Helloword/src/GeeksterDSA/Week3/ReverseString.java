package GeeksterDSA.Week3;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Kaushal";
		int top = -1;
		char[] arr = new char[s.length()];
		
		for(int i = 0;i<s.length();i++) {
			top++;
			arr[top] = s.charAt(i);
		}
		
		while(top>-1) {
			System.out.print(arr[top]);
			top--;
			
		}
	}

}
