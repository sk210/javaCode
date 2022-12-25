package Geekster.Week4;

class Parents{
	Parents(){
		System.out.println("Parents");
	}
	
	Parents(int x){
		System.out.println("Parents 2");
	}
	
	void Human() {
		System.out.println("You are parents");
	}
	
}

class Child3 extends Parents{
	Child3(){
		super();
//		super(10);
		System.out.println("Child3");
	}
	
	void Human() {
		System.out.println("You are child");
		super.Human();
	}
}

public class MoreAboutConstructer {

	public static void main(String[] args) {
		Child3 c3 = new Child3();
		c3.Human();

	}

}
