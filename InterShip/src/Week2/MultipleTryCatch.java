package Week2;

public class MultipleTryCatch {

	public static void main(String[] args) {
		try {
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			
			try {
				String s = null;
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
			try {
				int[] arr = new int[4];
				arr[4] = 90;
				System.out.println(arr[4]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				String s = "Kaushal";
				int i = Integer.parseInt(s);
			}
			catch(NumberFormatException e ) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			for(int i = 1;i<=5;i++) {
				for(int j = 1;j<=i;j++) {
					System.out.print(i*j + " ");
				}
				System.out.println();
			}
		}

	}

}
