package Geekster.Week3;

public class SecureMarksByArrays {

	public static void main(String[] args) {
		int[] marks = {18,19,16,15,20,9,12,20,20,10};
		int count = 0;
		
		for(int i = 0;i<marks.length;i++) {
			if(marks[i] == 20) {
				count++;
			}
		}
		System.out.println(count + " Students secured 100% marks");

	}

}
