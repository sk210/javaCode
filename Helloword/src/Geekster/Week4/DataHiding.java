package Geekster.Week4;

class Mobile{
	
	public static void common() {
		System.out.println("Which Mobile");
	}
}

// Can not reduce visibility of subclass to compare to super class(like public to protected in method overriding)
//class Iphone extends Mobile{
//	protected void common() {
//		System.out.println("Which Mobile");
//	}
//}

class Iphone extends Mobile{
	
	public static void common() {
		System.out.println("Iphone");
	}
}

public class DataHiding {

	public static void main(String[] args) {
		Iphone A1 = new Iphone();
		A1.common();

	}

}
