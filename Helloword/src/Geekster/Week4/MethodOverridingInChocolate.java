package Geekster.Week4;

class Chocolate extends MethodOverridingInChocolate
{
	public String taste()
    {
//		System.out.println(super.taste());
        return "tastes chocolately";
    }
}


public class MethodOverridingInChocolate {
	
	  public String taste()
	    {
	        return "tastes sweet!";
	    }


	public static void main(String[] args) {
		{
			MethodOverridingInChocolate c1 = new  MethodOverridingInChocolate();
	        System.out.println(c1.taste());
	        MethodOverridingInChocolate c2 = new Chocolate();
	        System.out.println(c2.taste());
	    }

	}

}
