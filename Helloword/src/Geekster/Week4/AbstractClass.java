package Geekster.Week4;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
	void setTitle(String s) {
		this.title = s; 
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		MyBook Novel = new MyBook();
		
		Novel.setTitle("A tale of two cities");
		System.out.println("The title is : " + Novel.getTitle());

	}

}
