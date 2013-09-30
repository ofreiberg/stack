//Oliver Freiberg

public class Factorial {
    
    static int factorial(int num) {
	int fact = 1; 

	while (num>0){
	    fact*=num--; //fact=num*i--
	}
	return fact; 
    }
    //1
    static int factorialR(int num) {
	if(num==0) return 1;
	return num * factorialR(num-1); //finds the factorial of any number using recursion
}
    //2
    static int sumR (int num) {
	if (num==0) return 0;
	return num + sumR(num-1); // if the number is greater than zero finds the summation of a set of numbers
    }
    //3
    static int powersR (int num, int pow) {
	if (pow==0) return 1;
	return num * powersR(num, pow-1); //finds a number to a specific power and if the power is 0 it returns 1
    }
    //4
    static int fib (int num){
	if (num==0) return 0;
	if (num==1) return 1;
	return fib(num-1) + fib(num-2); //finds the fibonacci sequence of a specific number 
    }
    //5
    static int sumD (int num){
	if (num<10) return num; 
	return sumD(num/10) + num%10; //finds the sum of the digits of a number using recursion
    }
    //6
    static int proD (int num){
	if (num<10) return num;
	return proD(num/10) *(num%10); //takes a number and finds the product of its digits, if the number is less than 10 than it returns the number that was entered

    }
    //7
    static int proD2 (int num, int pow){
	if (pow==0) return 0;
	return num + proD2(num, pow-1); //finds the product of two numbers using recursion to add one number with the second number with 1 being subtracted from the second number until it equals 0
    }
    //8
    static int sumN(int num, int pow){
	if(num==pow) return num;
	if (num<pow) return pow + sumN(num, pow-1);
        return num +sumN(pow, num-1); //finds the sum of numbers between a range of numbers by adding the first number to the second number-1 each time until the second number equals the 1st number
    }
    //9
    static int reverse(int num, int pow){
	if(num<10) return num+10*pow; 
	return reverse(num/10, 10*pow + num%10); //reverses the digits of a number 
    }
    //10
    /* static int gcd(int num, int pow){
	if(num<=pow && pow%num=0) return y;
	return gcd(pow, num%pow); */
    }
    
    public static void main(String[] args) {
	int num = Integer.parseInt(args[0]);
	int pow = Integer.parseInt(args[1]);
	System.out.println("factorial " + factorialR(num)); 

	System.out.println("Summation " + sumR(num));

	System.out.println("Powers " +  powersR(num, pow));

	System.out.println("Fibonacci numbers " + fib(num));

	System.out.println("Sum of a number's digits " + sumD(num));

	System.out.println("Product of a number's digits " + proD(num));

	System.out.println("Product of 2 whole numbers " + proD2(num, pow));
	
	System.out.println("Sum over a range of numbers  " + sumN(num, pow));

	System.out.println("The reverse of a numbers digits " +reverse(num, 0));
    }
}
