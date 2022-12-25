package GeeksterDSA.Week3;

public class MyStack {
	 public static void main(String args[]) {
	        Main s = new Main();
	        s.push(20);
	        s.push(23);
	        s.push(35);
	        s.push(67);
	        s.push(45);
	        s.push(23);
	        s.push(45);
	        
	        
	        System.out.println(s.pop() + " Popped from stack");
	        System.out.println("Top element is :" + s.peek());
	        System.out.print("Elements present in stack :");
	        s.print();
	    }
}
 
// Driver code
 class Main {
   
    
    
    static int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty() {
        return (top < 0);
    }
 
    Main() {
        top = -1;
    }
 
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
             top+=1;
            a[top++] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
    
   
 
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
 
    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}


