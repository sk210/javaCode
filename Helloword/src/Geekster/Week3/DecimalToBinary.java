package Geekster.Week3;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int i = userinput.nextInt();
		int[] arr = new int[4];
		int k = 0;
		int rem;
		while(i>0) {
			rem = i%2;
			arr[k] = rem;
			i = i/2;
			k++;
			
		}
		for(int l = arr.length-1;l>=0;l--) {
			System.out.print(arr[l]);
		}

	}

}
