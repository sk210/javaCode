package GeeksterDSA.Week3;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "abbaaz";
		int top = -1;
		
		char[] a = new char[s.length()];
		
		for(int i = 0;i<s.length();i++) {
			if(top == -1) {
				top++;
				a[top] = s.charAt(i);
			}
			else if(s.charAt(i) != a[top]) {
				top++;
				a[top] = s.charAt(i);
			}
			else if(s.charAt(i) == a[top]) {
				top--;
			}
			else {
				continue;
			}
		}
		
		String result = "";
		while(top>-1) {
			result = a[top] + result;
			top--;
		}

	}

}
