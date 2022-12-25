package Geekster.Week4;
import java.util.Scanner;

class ComplexNumber{
    int real;
    int imagenary;
    
    ComplexNumber(int a,int b){
        this.real = a;
        this.imagenary = b;
    }
    
    ComplexNumber addComp(ComplexNumber c1,ComplexNumber c2){
        c1.real = c1.real + c2.real;
        c1.imagenary = c1.imagenary + c2.imagenary;
        return c1;
    }
    
    ComplexNumber multiComp(ComplexNumber c1,ComplexNumber c2){
        int prod1 = c1.real * c2.real;
        int prod2 = c1.imagenary * c2.imagenary;
        int prod3 = (c1.real + c1.imagenary) * (c2.real+ c2.imagenary);
        
        c1.real = prod1-prod2;
        c1.imagenary = prod3 - (prod1 + prod2);
        return c1;
    }
}

public class ComplexNumberClass {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
        int a1 = userinput.nextInt();
        int b1 = userinput.nextInt();
        
        ComplexNumber c1 = new ComplexNumber(a1,b1);
        
        int a2 = userinput.nextInt();
        int b2 = userinput.nextInt();
        
        ComplexNumber c2 = new ComplexNumber(a2,b2);
        
        int choice = userinput.nextInt();
        
        if(choice == 1){
            c1.addComp(c1,c2);
            System.out.println(c1.real + " +i" + c1.imagenary);
        }
        else if(choice == 2){
            c1.multiComp(c1,c2);
            System.out.println(c1.real + " +i" + c1.imagenary);
        }

	}

}
