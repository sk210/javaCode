package Geekster.Week4;

public class EqualsMethodsInDog {

	  private String name;

	    public EqualsMethodsInDog(String name)
	    {
	        this.name = name;
	    }

	    public boolean equals(String name)
	    {
	        return this.name == name;
	    }

	    public static void main(String[] args)
	    {
	    	EqualsMethodsInDog d1 = new EqualsMethodsInDog("Rufus");
	    	EqualsMethodsInDog d2 = new EqualsMethodsInDog("Sally");
	    	EqualsMethodsInDog d3 = new EqualsMethodsInDog("Rufus");
	    	EqualsMethodsInDog d4 = d3;
	        System.out.println(d1.equals(d2.name));
	        System.out.println(d2.equals(d3.name));
	        System.out.println(d1.equals(d3.name));
	        System.out.println(d3.equals(d4.name));
	    }


}
