package Geekster.Week3;
import java.util.Scanner;

public class DifferenceInTwoArray {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("How much element add in to the Arrays : ");
		int num = userinput.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		int[] result = new int[num];
		int j;
		System.out.print("enter numbers for first array : ");
		for(int i = 0;i<num;i++) {
			j = userinput.nextInt();
			arr1[i] = j;
		}
		System.out.print("enter numbers for second array : ");
		for(int i = 0;i<num;i++) {
			j = userinput.nextInt();
			arr2[i] = j;
		}
		for(int i = 0;i<num;i++) {
			result[i] = arr1[i] - arr2[i];
		}
		
		System.out.print("The difference between two array is : ");
		for(int i = 0;i<num;i++) {
			System.out.print(result[i] + " "); 
		}
	}

}
