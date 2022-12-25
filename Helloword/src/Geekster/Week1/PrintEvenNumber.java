package Geekster.Week1;

public class PrintEvenNumber {

	public static void main(String[] args) {
		System.out.println("using for loop print even number");
		for(int i = 0; i <= 10;i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("using while loop print even number");
		
		int k = 0;
		while(k<=10) {
			System.out.println(k);
			k=k+2;
		}

	}

}
