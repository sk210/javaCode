package GeeksterDSA.Week2;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter row number : ");
		int row = userinput.nextInt();
		
		System.out.print("Enter Columan Number : ");
		int columan = userinput.nextInt();
		
		int[][] arr = new int[row][columan];
		
		System.out.println("Enter Array number : ");
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<columan;j++) {
				arr[i][j] = userinput.nextInt();
			}
		}
		
		for(int i = 0;i<row;i++) {
			for(int j = 0;j<columan;j++) {
				System.out.print(arr[i][j] + " ");			
			}
			System.out.println();

		}
		
	}

}
