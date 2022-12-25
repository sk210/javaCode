package Geekster.Week4;

//class polymorphisam{
//	
//}

class Father1{
	int legs;
	int eyes;
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	void common() {
		System.out.println("Father");
	}
	
}

class Child1 extends Father1{
	int Hands;

	public int getHands() {
		return Hands;
	}

	public void setHands(int hands) {
		Hands = hands;
	}
	
	@Override
	void common() {
		System.out.println("Child");
	}
	
	
}

public class OOPSConcept3 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		
		c1.common();
		
		System.out.println(c1 instanceof Child1);
		System.out.println(c1 instanceof Father1);

	}

}
