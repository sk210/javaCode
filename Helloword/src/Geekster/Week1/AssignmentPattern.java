package Geekster.Week1;

public class AssignmentPattern {

	public static void main(String[] args) {
		
		int n = 5;
		
		// Print Reverse Pyramid Pattern : 
		System.out.println("Reverse Pyramid Pattern");
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Diamond Pattern : 
		System.out.println();
		System.out.println("Diamond Pattern");
		for(int i = 1;i<=n;i++) {
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = n-1;i>=1;i--) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Print Reverse Pyramid Number Pattern : 
		System.out.println();
		System.out.println("Reverse Pyramid Number Pattern");
		int counter = 1;
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print(counter + " ");
			}
			System.out.println();
			counter = counter + 1;
		}
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
