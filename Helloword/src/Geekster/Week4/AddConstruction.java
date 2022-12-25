package Geekster.Week4;

class Person
{
   // fields
   private String name;
   private String email;
   private String phoneNumber;

   // constructor
   public Person() {
	   this("Sunena");
	   System.out.println("your name is right now : " + this.name);
	   System.out.println("Your email is : " + this.email);
	   System.out.println("Your phonenumber is : " + this.phoneNumber);
	   System.out.println("If your name, email and phonenumber something else please change");
   }
   
   public Person(String theName)
   {
	  this("sunena123@gmail.com","9756431260");
      this.name = theName;
      
   }
   
   public Person(String email,String phonenumber) {
	   this.email = email;
	   this.phoneNumber = phonenumber;
	  
   }

   // methods - getters
   public String getName() { return this.name;}
   public String getEmail() { return this.email;}
   public String getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }
   
}

public class AddConstruction {

	public static void main(String[] args) {
		  Person p1 = new Person();
	      System.out.println(p1);
	      Person p2 = new Person();
	      p2.setEmail("jean@gmail.com");
	      p2.setPhoneNumber("404 899-9955");
	      System.out.println(p2);


	}
	
}





