package GeeksterDSA.Week2;

public class foo {
	
	public static int foo(int n,int r) {
		if(n>0) return (n%r + foo(n/r,r));
		else return 0;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(foo(513,2));

	}

}
