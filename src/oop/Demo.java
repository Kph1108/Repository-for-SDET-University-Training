package oop;

class Person
{
	String name;
	String email;
	String phone;
	
	void walk()
	{
		System.out.println(name + " is walking");
	}
	
	void eat()
	{
		System.out.println(name + " is eating");		
	}
	
	void sleep()
	{
		System.out.println(name + " is sleeping");		
	}
	
}

public class Demo {
	public static void main(String[] args)
	{
//		// Person -
//		//Attributes, variables, adjectives, descriptors
//		String name = "Joe";
//		String email = "joe@testemail.com";
//		String phone = "9547563249";
//		
//		//What if we wanted to do this for another person
//		String name2 = "Sarah";
//		String email2 = "sarah@testemail.com";
//		String phone2 = "9547563247";
//		
//		//Action, activity, behavior
//		walking(name2);
//		System.out.println(name2 + " is eating.");
//	
		//what about binding attributes and properties together?
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "9547563249";
		
		//Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		Person person2 = new Person();
		
		//Define some properties
		person2.name = "Sarah";
		//person2.email = "joe@testemail.com";
		//person2.phone = "9547563249";
		
		//Abstraction
		//person1.walk();
		//person1.eat();
		person2.sleep();
	}
	
//	static void walking(String name) 
//	{
//		System.out.println(name + " is walking");
//	}
}
