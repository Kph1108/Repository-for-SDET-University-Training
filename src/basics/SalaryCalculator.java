package basics;

public class SalaryCalculator {
	public static void main(String[] args) 
	{
		//Compute our annual salary
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career" + career);
		
		//Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" +rate+ " per hour is $" + salary + " per year.");
		//rate*hoursPerWeek*weeksPerYear
	}
}
