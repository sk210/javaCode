package GeeksterDSA.Week2;


public class BaseConditionConcept {
//	static int counter = 0; 
	public static void print(int counter) {
		
		if(counter>10) {
			return;
		}
		
		
		print(counter+1);
		System.out.print(counter + " ");
		
		
	}

	public static void main(String[] args) {
		print(0);

	}

}
