package Geekster.Week4;

class Parents4{
	
	Parents4(){
		System.out.println("Parents4 Constructer");
	}
	public static void parents() {
		System.out.println("Say Hii to parents");
	}
}

class Child5 extends Parents4{
	
	Child5(){
		System.out.println("Child5 Constructer");
	}
	public static void parents() {
		System.out.println("Say Hii to Child5");
	}
}

public class ChildStaticMethod {

	public static void main(String[] args) {
		Child5 c5 = new Child5();
		Parents4 c6 = new Child5();
		
//		Child5 c7 = new Parents4);
		
		c5.parents();
		

	}

}
