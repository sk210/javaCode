package Geekster.Week4;

//class inheritance{
//	
//}

class Vehicle1{
	int speed;
	int tyre;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getTyre() {
		return tyre;
	}
	public void setTyre(int tyre) {
		this.tyre = tyre;
	}
	
	
}

class Car extends Vehicle1{
	int sheet;
	String carName;
	
	
	public int getSheet() {
		return sheet;
	}
	public void setSheet(int sheet) {
		this.sheet = sheet;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	
}

public class OOPSConcept2 {

	public static void main(String[] args) {
		Car BMW = new Car();
		
		BMW.setSpeed(50);
		BMW.setTyre(4);
		BMW.setSheet(4);
		BMW.setCarName("BMW");
		
		System.out.println(BMW.getSpeed());
		System.out.println(BMW.getTyre());
		System.out.println(BMW.getSheet());
		System.out.println(BMW.getCarName());
		

	}

}
