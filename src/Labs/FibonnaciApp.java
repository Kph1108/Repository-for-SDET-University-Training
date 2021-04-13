package Labs;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class FibonnaciApp {
	//fibonnaci number is defined by the sum of the previous 2 numbers
	//fib(0) = 0
	//fib(1) = 1
	//fib(2) = fib(0) + fib(1) = 0+1 = 1
	//fib(3) = fib(1) + fib(2) = 1+1 = 2
	//fib(4) = fib(2) + fib(3) = 2+1 = 3
	//fib(5) = fib(3) + fib(4) = 2+3 = 5
	
	//1! = 1(
	
	public static void main(String[] args) 
	{
		System.out.println(fib(3));
		//int arrayTest[] = {0,1,2,3,4,5,6,7,8};
		//System.out.println(min(arrayTest));
	}

	public static int fib(int n) 
	{
		if(n == 0) 
		{
			return 0;
		}
		else if(n == 1) 
		{
			return 1;
		}
		
		return (fib(n-1)+fib(n-2));
	}
	
}
