package Geekster.PracticeSession;

public class SameArrayOrNot {
	
	public static boolean SameArray(int[] arr1,int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		else {
			for(int i = 0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					return false;
//					break;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,6};
		boolean bool = SameArray(arr1,arr2);
		System.out.println(bool);
	}

}
