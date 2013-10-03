public class IntStack {
    int [] stack;
    int top;
    
    public IntStack(int size) {
	top=0;
	stack = new int[size];
	

    }
    boolean isEmpty() {
	return top==0; //if top==0 returns true else returns false  
    }

    void push(int num) {
	statck[top++]=num; //stack=top at num and then it adds 1 to top so that way top moves over one and the next item that is pushed will be put into the next available space 
    }

    int pop() {
	return stack[--top]; //subtracts 1 from top so that it is in the nearest filled space and returns what is in that space and then when the next item is pushed it overrides what is in that space 
    }
    int peek() {  
	retun stack[top-1]; //looks behind one space in the stack 
    }

    public static void main(String[] args) {
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	int k = is.pop();
	System.out.println(k);
    }

}
