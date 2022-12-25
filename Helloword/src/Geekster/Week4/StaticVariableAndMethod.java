package Geekster.Week4;

class Static{
	static int age;
	static String s;
	int mark;
	
	public static void setStaticMethod(int num) {
		age = num;
	}
	
	public void setStaticMethod(String str) {
		s = str;
	}
}

public class StaticVariableAndMethod {

	public static void main(String[] args) {
		Static student1 = new Static();
		Static student2 = new Static();
		
		student1.setStaticMethod(15);
		student2.setStaticMethod("kaushal");
		
		System.out.println(Static.age);
		
		System.out.println(student1.age);
		System.out.println(student2.age);
		
		System.out.println(student1.s);
		System.out.println(student2.s);
		

	}

}
