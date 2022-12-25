package Geekster.Week4;

public class MethodOverlodingInTalk {
	
	  public static void talk()
	    {
	          System.out.println("hello there!");
	    }

	  public static void talk(String s)
	    {
	          System.out.println("Hello " + s);
	    }
	  
	public static void main(String[] args) {
		 {
	          talk("Matthew");
	    }
	}

}
