package Geekster.Week4;

class Encpsulation{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class OPPSConcept {

	public static void main(String[] args) {
		Encpsulation obj1 = new Encpsulation();
		Encpsulation obj2 = new Encpsulation();
		
		System.out.println(obj1.getAge());
		System.out.println(obj1.getName());
		
		obj1.setAge(15);
		obj1.setName("Kaushal");
		
		System.out.println(obj1.getAge());
		System.out.println(obj1.getName());
		
		

	}

}
