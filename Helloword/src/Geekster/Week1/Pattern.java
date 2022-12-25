package Geekster.Week1;

public class Pattern {

	public static void main(String[] args) {
		
		int n = 5;
		
		// Print 5*5 Square Pattern : 
		System.out.println("Print Square Pattern");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Triangle Pattern :
		System.out.println();
		System.out.println("Print Triangle Pattern");
		for(int i = 1; i<=n;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Reverse Triangle Pattern :
		System.out.println();
		System.out.println("Print Reverse Triangle Pattern");
		
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1;i<=n;i++) {
			for(int j = n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Horizontal Triangle Pattern : 
		System.out.println();
		System.out.println("Horizontal Triangle Pattern");
		for(int i = 1; i<=4;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
		for(int i = 1;i<=n;i++) {
			for(int j = n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Triangle Number Pattern :
		System.out.println();
		System.out.println("Print Triangle Number Pattern");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// Print Triangle II Pattern : 
		System.out.println();
		System.out.println("Triangle II pattern");
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Reverse Triangle II Pattern : 
		System.out.println();
		System.out.println("Reverse Triangle II Pattern");
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Pyramid Pattern :
		System.out.println();
		System.out.println("Pyramid Pattern");
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
