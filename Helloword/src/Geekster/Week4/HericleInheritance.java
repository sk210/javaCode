package Geekster.Week4;

class Human{
	void Speak(){
		System.out.println("Hello");
	}
}

class Father2{
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
	
}

class Mother2 extends Human{
	int noise;

	public int getNoise() {
		return noise;
	}

	public void setNoise(int noise) {
		this.noise = noise;
	}
	
}

class Child2 extends Human{
	int Hands;

	public int getHands() {
		return Hands;
	}

	public void setHands(int hands) {
		Hands = hands;
	}
	
	
}

public class HericleInheritance {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		
		c2.Speak();
		c2.setHands(2);
//		c2.setNoise(5);
		
		System.out.println(c2.getHands());

	}

}
