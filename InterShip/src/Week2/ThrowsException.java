package Week2;
import java.io.IOException;

public class ThrowsException {
	
	void m()throws IOException{
		throw new IOException("device Error");
	}
	
	void n()throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
		}
		catch(Exception e){
			System.out.println("Error handller");
		}
	}

	public static void main(String[] args) {
		ThrowsException obj1 = new ThrowsException();
		obj1.p();
		System.out.println("Display");
		

	}

}
