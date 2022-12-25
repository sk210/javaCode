package GeeksterDSA.Week3;

 class Stack {
   
    
    
    static int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty() {
        return (top < 0);
    }
 
    Stack() {
        top = -1;
    }
 
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
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

public class PrintReverseNumberUsingStack {
	
	public static void reverse(int number) {
	Stack s = new Stack();
		
	int tempnumber = number;
	int count = 1;
	
	while(tempnumber != 0) {
		count = count * 10;
		tempnumber /= 10;
		
	}
	
	int tempCount = count/10;
	
	while(number != 0) {
		int rem = number%count;
		count /= 10;
		int temp = rem/count;
		number = rem%count;
		s.push(temp);
		
		
				
	}
	
	while(tempCount>0) {
		int x = s.pop();
		System.out.print(x + " ");
		tempCount /= 10;
	}
	
	
	
		
		
	}

	public static void main(String[] args) {
		
		int number = 1234;
		reverse(1234);
		

	}

}
