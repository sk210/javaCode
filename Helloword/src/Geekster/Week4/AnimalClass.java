package Geekster.Week4;
import java.util.Scanner;

class Animal{
	
	int AnimalAge;
	String AnimalType;
	float AnimalWeight;
	String AnimalName;
	static int increment;
	static int incrementAge;
	
	public Animal() {
		this("cat");
		System.out.println("You not enter anything");
	}
	
	public Animal(String animalName) {
		this(5,"Small Animal",10.34f);
		this.AnimalName = animalName;
		System.out.println("animal is : " + this.AnimalName);
	}

	public Animal(int animalAge, String animalType, float animalWeight) {
		this.AnimalAge = animalAge;
		this.AnimalType = animalType;
		this.AnimalWeight = animalWeight;
		this.increment++;
		System.out.println("Animal Type is : " + this.AnimalType);
		System.out.println("Animal Age is : " + this.AnimalAge);
		System.out.println("Animal Weight is : " + this.AnimalWeight);
		System.out.println(this.increment + " object is created");
		
	}

	public int getAnimalAge() {
		return AnimalAge;
	}
	public void setAnimalAge(int animalAge) {
		AnimalAge = animalAge;
	}
	public String getAnimalType() {
		return AnimalType;
	}
	public void setAnimalType(String animalType) {
		AnimalType = animalType;
	}
	public float getAnimalWeight() {
		return AnimalWeight;
	}
	public void setAnimalWeight(float animalWeight) {
		AnimalWeight = animalWeight;
	}
	public String getAnimalName() {
		return AnimalName;
	}
	public void setAnimalName(String animalName) {
		AnimalName = animalName;
	}
	
	public void AnimalType(String AnimalName) {
		if(AnimalName == "dog" || AnimalName == "Dog") {
			System.out.println("you have dog animal");
		}
		else if(AnimalName == "cow" || AnimalName == "Cow") {
			System.out.println("you have cow animal");
		}
		else if(AnimalName == "elephant" || AnimalName == "Elephant") {
			System.out.println("you have elephant animal");
		}
		else {
			System.out.println("you entered another animal");
		}
	}
	
	public static void incrementAge() {
		incrementAge++;
		System.out.println("increment Age is : " + incrementAge);
	}
	
	
}

public class AnimalClass {

	public static void main(String[] args) {
		Animal cat = new Animal();
		Animal cow = new Animal("cow");
		Animal elephant = new Animal("elephant");
		Animal dog = new Animal(3,"small animal",15.34f);
		
		
		cow.AnimalType("cow");
		cat.AnimalType("cat");
		
		elephant.setAnimalAge(12);
		elephant.setAnimalName("elephant");
		elephant.setAnimalType("Ginat Animal");
		elephant.setAnimalWeight(996.45f);
		
		System.out.println("Your animal name is : " + elephant.getAnimalName());
		System.out.println("Your animal type is : " + elephant.getAnimalType());
		System.out.println("Your animal age is : " + elephant.getAnimalAge());
		System.out.println("Your animal weight is : " + elephant.getAnimalWeight());
		
		cow.incrementAge();
		cat.incrementAge();
		elephant.incrementAge();
		dog.incrementAge();

	}

}
