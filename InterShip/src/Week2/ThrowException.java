package Week2;

public class ThrowException {
	
	public static void validate(int age) {
		try {
			if(age<18) {
				
				throw new ArithmeticException("person is not eligable for vote");
			}
			else {
				System.out.println("you are eligabale for vote");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		validate(15);
		System.out.println("code is compleate");

	}

}
