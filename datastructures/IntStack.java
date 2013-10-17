import java.util.Random;
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
	stack[top++]=num; //stack=top at num and then it adds 1 to top so that way top moves over one and the next item that is pushed will be put into the next available space 
    }

    int pop() {
	return stack[--top]; //subtracts 1 from top so that it is in the nearest filled space and returns what is in that space and then when the next item is pushed it overrides what is in that space 
    }
    int peek() {  
	return stack[top-1]; //looks behind one space in the stack 
    }

    //issue #2
    int[] randomize(){

	int[] list = new int[top];
	for (int i=0; i< list.length; i++)
	    {
		//make the array
		list[i] = peek(i);
	     
	    }
	shuffleArray(list);
	return list;
    }
    //borrowed from http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
	static void shuffleArray(int[] ar)
	{
	    Random rnd = new Random();
	    for (int i = ar.length - 1; i > 0; i--)
		{
		    int index = rnd.nextInt(i + 1);
		    // Simple swap
		    int a = ar[index];
		    ar[index] = ar[i];
		    ar[i] = a;
		}
	}
  
    //issue #10   
    //by raina
    int[] popall(){
	//make an array
	int[] list = new int[top];
	for (int i=0; i< list.length; i++)
	    {
		list[i] = pop();
	    } 
	//return the array
	return list;
    }

    public static void main(String[] args) {
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	
	int k = is.pop();
	System.out.println(k);
	System.out.println();

	//test for randomize
	int[] test = is.randomize();
	for (int j : test) System.out.println(j+" ");
	System.out.println("\n");

	//tests for popall:
        int[] tmpArr = is.popall();
	for (int i : tmpArr) System.out.print(i + " ");
	System.out.println("\n");
    }

}
