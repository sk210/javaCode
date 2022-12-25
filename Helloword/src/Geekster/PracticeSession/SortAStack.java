package Geekster.PracticeSession;
import java.util.Scanner;

public class SortAStack {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
        int n = userinput.nextInt();
        int[] arr = new int[n];
        int top = -1;
        while(n > 0){
            String s = userinput.next();
            if(s == "push"){
                int num = userinput.nextInt();
                top++;
                arr[top] = num;
            }
            else if(s == "pop"){
                top--;
            }
            n--;
        }
        
        for(int i = top;i>=0;i--){
            System.out.print(arr[i] + " ");
        }

	}

}
