package Week4;

import java.util.HashMap;

class Fruit{
	String name;
	String color;
	int price;
	
	Fruit(String name,String color,int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
}

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, Fruit> hm = new HashMap<Integer, Fruit>();
		hm.put(1,new Fruit("Banana","Yellow",30));
		

	}

}
