package Geekster.Week1;

public class PrintReverseEvenNumber {

	public static void main(String[] args) {
		System.out.println("using for loop print reverse even number");
		for(int i = 10;i >= 0;i = i-2) {
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("using while loop print reverse even number");
		
		int k = 10;
		while(k>=0) {
			System.out.println(k);
			k = k-2;
		}

	}

}
