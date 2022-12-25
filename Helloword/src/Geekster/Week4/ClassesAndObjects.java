package Geekster.Week4;
import java.util.Scanner;

class Vehicle{
	
	String model;
	String company;
	String vehicleNumber;
	int price;
	
	Vehicle(){
		System.out.println("You create new vehicle without any information");
	}
	
	Vehicle(String company){
		System.out.println("You create new vehicle with company name informatin");
		System.out.println("Your vehicle comapany name is " + company);
	}
	
	Vehicle(String company,String model){
		System.out.println("You create new vehicle with company name and model information");
		System.out.println("Your vehicle company name is " + company + " and model is " + model);
	}
	
	Vehicle(String company,String model,String vehicleNumber){
		System.out.println("You create new vehicle with comapany name and model information and vehicleNumber");
		System.out.println("Your vehicle company name is " + company + " and model is " + model + " and vehicleNumber is " + vehicleNumber);
	}
	
	Vehicle(String company,String model,String vehicleNumber,int price){
		System.out.println("You create new vehicle with comapany name and model information and vehicleNumber and you also give price of vehicle");
		System.out.println("Your vehicle company name is " + company + " and model is " + model + " and vehicleNumber is " + vehicleNumber + " and price is " + price);
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getComapany() {
		return this.company;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getmodel() {
		return this.model;
	}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getVehicleNumber() {
		return this.vehicleNumber;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public static void bike() {
		System.out.println("Congratulation you buy a new bike");
	}
	
	public static void car() {
		System.out.println("Congratulation you buy a new car");
	}
	
	public static void truck() {
		System.out.println("Congratulation you buy a new truck");
	}
	
}

public class ClassesAndObjects {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("which vehicle you can create(Bike/Car/Truck) : ");
		char ch = userinput.next().charAt(0);
		
		if(ch == 'B' || ch == 'b') {
			Vehicle bike = new Vehicle();
			System.out.print("Enter the company name in single word : ");
			String company = userinput.next();
			System.out.print("Enter the model name in single word : ");
			String model = userinput.next();
			System.out.print("Enter the Vehicle Number in single word : ");
			String vehicleNumber = userinput.next();
			
			
			bike.setCompany(company);
			bike.setModel(model);
			bike.setVehicleNumber(vehicleNumber);
			bike.setPrice(100000);
			
			System.out.println("Your entered company name is : " + bike.getComapany());
			System.out.println("Your entered model name is : " + bike.getmodel());
			System.out.println("Your entered vehicle number is : " + bike.getVehicleNumber());
			System.out.println("Your bike price is : " + bike.getPrice());
			bike.bike();
		}
		else if(ch == 'C' || ch == 'c') {
			Vehicle car = new Vehicle("audi","Audi A4");
			System.out.print("Enter the company name in single word : ");
			String company = userinput.next();
			System.out.print("Enter the model name in single word : ");
			String model = userinput.next();
			System.out.print("Enter the Vehicle Number in single word : ");
			String vehicleNumber = userinput.next();
			
			car.setCompany(company);
			car.setModel(model);
			car.setVehicleNumber(vehicleNumber);
			car.setPrice(600000);
			
			System.out.println("Your entered company name is : " + car.getComapany());
			System.out.println("Your entered model name is : " + car.getmodel());
			System.out.println("Your entered vehicle number is : " + car.getVehicleNumber());
			System.out.println("Your car price is : " + car.getPrice());
			car.car();
			
		}
		else if(ch == 'T' || ch == 't') {
			Vehicle truck = new Vehicle("Ashok Leyland","Ashok Leyland 4825","Gj 01 4323",4800000);
			System.out.print("Enter the company name in single word : ");
			String company = userinput.next();
			System.out.print("Enter the model name in single word : ");
			String model = userinput.next();
			System.out.print("Enter the Vehicle Number in single word : ");
			String vehicleNumber = userinput.next();
			
			truck.setCompany(company);
			truck.setModel(model);
			truck.setVehicleNumber(vehicleNumber);
			truck.setPrice(4800000);
			
			System.out.println("Your entered company name is : " + truck.getComapany());
			System.out.println("Your entered model name is : " + truck.getmodel());
			System.out.println("Your entered vehicle number is : " + truck.getVehicleNumber());
			System.out.println("Your truck price is : " + truck.getPrice());
			truck.truck();
		}
		else {
			System.out.println("you entered wrong vehicle");
		}
		

	}

}
