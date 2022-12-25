package Geekster.Week3;

import java.util.Scanner;

public class LastIndexOfElement {
	
	public static int LastIndex(int[] arr,int ele) {
		int index = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == ele) {
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("How much element add in to the Arrays : ");
		int num = userinput.nextInt();
		int[] arr = new int[num];
		int j;
		System.out.print("enter numbers for array : ");
		for(int i = 0;i<arr.length;i++) {
			j = userinput.nextInt();
			arr[i] = j;
		}
		
		System.out.print("Which element to you can find index : ");
		int ele = userinput.nextInt();
		System.out.print("your element index is : " + LastIndex(arr,ele));


	}

}
