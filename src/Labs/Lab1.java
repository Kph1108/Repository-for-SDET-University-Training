package Labs;

public class Lab1 {
	public static void main(String[] args) 
	{
		int arrayTest[] = {0,1,20000,3,-436,5,6,7,8};
		int testSum = 5;
		System.out.println("This is the sum of all values from 1 to "+ testSum+ " Sum: " + sum(testSum));
		System.out.println("This is the factorial of "+ testSum+ " Factorial: " + factorial(testSum));
		System.out.println("This is the Max of all values from test array"+ " Max: " + max(arrayTest));
		System.out.println("This is the Min of all values from test array " + " Min: " + min(arrayTest));
		System.out.println("This is the Average of all values from test array " + " Average: " + average(arrayTest));
	}
	
	public static int factorial(int n) 
	{
		//0! = 1
		//1! = 1
		//2! = 1!*2 = 1*2 = 2
		//3! = 2!*3 = 2*3 = 6
		//4! = 3!*4 = 6*4 = 24
		
		if(n<=1) 
		{
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static int sum(int n) 
	{
		int sumTotal = 0;
		for(int i = 1; i<=n;++i) 
		{
			sumTotal+=i;
		}
		
		return sumTotal;
	}
	
	public static int min(int array[]) 
	{
		int minimum = Integer.MAX_VALUE;
		for(int i = 0; i<array.length; ++i) 
		{
			if(array[i]<minimum) 
			{
				minimum = array[i];
			}
		}
		
		return minimum;
	}
	
	public static int max(int array[]) 
	{
		int maximum = Integer.MIN_VALUE;
		for(int i = 0; i<array.length; ++i) 
		{
			if(array[i]>maximum) 
			{
				maximum = array[i];
			}
		}
		
		return maximum;
	}
	
	public static int average(int array[]) 
	{
		int average = 0;
		for(int i = 0; i<array.length; ++i) 
		{
			average += array[i];
		}
		average = (average/array.length);
		return average;
	}
}
