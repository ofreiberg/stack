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

    void reverse() {

	int[] thing = new int[top];
	for (int p = 0; p <= thing.length; p++) {
	    thing[p] = pop();
	}
	for (int p : thing) {
	    push(p);
	    System.out.println(p);
	}
    }
    //issue #1

    
    //issue #2
    int[] randomize(){

	int[] list = new int[top];
	for (int i=0; i< list.length; i++)
	    {
		//make the array
		list[i] = peekDepth(i);
	     
	    }
	shuffleArray(list);
	return list;
    }
    /*borrowed from http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array*/
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
    /*
     *Works like the peekDepth just with a random depth
     *By Sam Chapin
     */
    int peekRDepth() {
	Random generator = new Random();
	int num = generator.nextInt(top);
	return stack[top-num]; //looks behind a random inputted space
    }
    /*
     *This is not usable at this point acording to charlie
     *By Sam Chapin (No longer usable or called)
     */
    int popRDepth() {
	Random generator = new Random();
	int num = generator.nextInt(top);
	int x = stack[top-num];
	stack[top-num] = 0;
	return x;
    }
    /*
     *This is the same as pushSDepth except it is random instead of a set depth
     *By Sam Chapin it does not delet the information, which used to be in that spot.
     */
    void pushRDepth(int num) {
	Random generator = new Random();
	int num2 = generator.nextInt(top);
	for(int i = top; i == top-num2; i--){
	    stack[i+1] = stack[i];
	}
	stack [top - num2] = num;
	top ++;
    }
    /*
     *This is to put in a number at a set depth it also adds the area to top.
     *By Sam Chapin it does not delet the information, which used to be in that spot.
     */
    void pushSDepth(int num, int num2) {
	if (num2>top) {
	    num2 = top;
	}
	for(int i = top; i == top-num2; i--){
	    stack[i+1]=stack[i];
	}
	stack [top-num2] =num;
	top++;
    }
    public static void main(String[] args) {
	IntStack is = new IntStack(10);
	is.push(4);
	is.push(5);
	is.push(6);
	System.out.println("The number at 3 is " + is.peekDepth(3));
	int k = is.pop();
	System.out.println(k);
	System.out.println("at a random depth it is " + is.peekRDepth());
	//I removed pop at random depth because it goes against the principles of the stack & Charlie said I might want to avoid it:
	is.pushRDepth(9);
	is.pushSDepth(3,5);
	
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
