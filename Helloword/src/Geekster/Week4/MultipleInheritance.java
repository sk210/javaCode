package Geekster.Week4;

class Father{
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
	public void common() {
		System.out.println("Father");
	}
	
}

class Mother extends Father{
	int noise;

	public int getNoise() {
		return noise;
	}

	public void setNoise(int noise) {
		this.noise = noise;
	}
	
	public void common() {
		super.common();
		System.out.println("Mother");
	}
	
}

class Child extends Mother{
	int Hands;

	public int getHands() {
		return Hands;
	}

	public void setHands(int hands) {
		Hands = hands;
	}
	
	public void common() {
		System.out.println("Child");
		super.common();
	}
	
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Mother m1 = new Mother();
		Child c1 = new Child();
		
		m1.setEyes(3);
		c1.setEyes(2);
		System.out.println(c1.getEyes());
		c1.common();

	}

}
