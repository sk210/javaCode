package Geekster.Week4;

class Beagle extends MethodOverridingInDog
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}



public class MethodOverridingInDog {
	
	 public void speak()
	    {
	        System.out.println("woof!");
	    }

	public static void main(String[] args) {
		  {
			  MethodOverridingInDog  d = new MethodOverridingInDog ();
		        d.speak();
		        MethodOverridingInDog  b = new Beagle();
		        b.speak();
		    }

	}

}
