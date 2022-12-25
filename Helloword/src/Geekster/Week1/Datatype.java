package Geekster.Week1;

import java.util.Scanner;

public class Datatype {

	public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
		
		System.out.print("please enter number : ");
		int i = userinput.nextInt();
		while(i>=0) {
			System.out.println(i);
			i = i-2;
		}
		
		// long Data type use :
		
		System.out.print("Enter your balance: ");
		long balance = userinput.nextLong();
		System.out.println("your balance is: " + balance);
		
		// char Data type use :
		
		System.out.print("can you check your balance(y/n): ");
		char choice = userinput.next().charAt(0);
		if(choice == 'y') {
			System.out.println("Your Balance is :" + balance);
		}else if(choice == 'n'){
			System.out.println();
		}else {
			System.out.println("you press another key");
		}
		
		// boolean Data type use : 
		
		System.out.print("you are pass in the exam it is true or false(true/false) : ");
		boolean pass = userinput.nextBoolean();
		if(pass) {
			System.out.println("Congraulation");
		}else {
			System.out.println("don't upset do more hardwork and give again exam");
		}
		
		// float Data type use : 
		
		System.out.print("Enter your balance in lakh : ");
		float bal = userinput.nextFloat();
		System.out.println("your balance is : " + bal);
		
		//double Data type is us : 
		
		if(pass) {
			System.out.print("Enter your mark with proper decimal number : ");
			double marks = userinput.nextDouble();
			System.out.println("your marks is : " + marks);
		}

	}

}
