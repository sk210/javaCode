package Week2;
import java.util.ArrayList;

class Student{
	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

public class ArrayList1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Kaushal",21);
		Student s2 = new Student(102,"Jay",20);
		Student s3 = new Student(103,"Manshi",20);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student s : al) {
			System.out.println(s.rollno + "\t"+ s.name + "\t" + s.age);
		}
	}

}
