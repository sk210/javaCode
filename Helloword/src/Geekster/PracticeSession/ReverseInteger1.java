package Geekster.PracticeSession;

public class ReverseInteger1 {
	
	public static int reverse(int x) {
        String s = Integer.toString(x);
        int top = -1;
        String result = "";
        char[] arr = new char [s.length()];
        for(int i = 0;i<s.length();i++) {
			top++;
			arr[top] = s.charAt(i);
		}
        
        while(top>-1){
            result = result + arr[top];
            top--;
        }
        
        int f = Integer.parseInt(result);
        return f;
    }

	public static void main(String[] args) {
		System.out.println(reverse(123));

	}

}
