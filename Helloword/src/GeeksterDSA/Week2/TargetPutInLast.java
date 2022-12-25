package GeeksterDSA.Week2;

public class TargetPutInLast {
	static String s = "axbcdxxty";
	static String result = "";
	static int count = 0;
	public static void TargetInLast(int index,char ch){
		if(index == s.length()-1){
			while(count>0) {
				result += ch; 
				count--;
			}
			System.out.println(result);
			return;
		}
		if(s.charAt(index) != ch) {
			result += s.charAt(index);
			TargetInLast(index+1,ch);
		}else {
			count++;
			TargetInLast(index+1,ch);
		}
		
	}

	public static void main(String[] args) {
		char ch = 'x';
		TargetInLast(0,ch);

	}

}
