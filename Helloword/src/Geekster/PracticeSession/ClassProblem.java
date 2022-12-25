package Geekster.PracticeSession;

class Base{
	public void print() {
		System.out.println("Base");
	}
}

class Derived extends Base{
	public void print() {
		System.out.println("Derived");
	}
}

public class ClassProblem {
	
	public static void doprint(Base o) {
		o.print();
	}

	public static void main(String[] args) {
		Base x = new Base();
		Base y = new Derived();
		Derived z = new Derived();
		doprint(x);
		doprint(y);
		doprint(z);

	}

}
