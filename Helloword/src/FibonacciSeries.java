
public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 10;
		int j = 0;
		int k = 1;
		int l;
		
		System.out.println(j);
		System.out.println(k);
		
		for(int i = 3;i<=a;i++) {
			l = j + k;
			System.out.println(l);
			j = k;
			k = l;
		}

	}
}

	
