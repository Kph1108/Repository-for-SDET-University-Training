package Labs;

public class Student {
	
	private String phone;
	private String city;
	private String state;
	private static int iD = 100;
	private String emailId;
	private String name;
	private String SSN;
	
	Student(String name, String SSN)
	{
		int random  = (int)(Math.random()*10000);
		this.SSN = SSN;
		this.name = name;
		System.out.println("User ID: " + iD + random + SSN.substring(8, 11));
		System.out.println("Email ID: " + name+"@testmail.com");
	}
	
	public void enroll() 
	{
		System.out.println("Enrolled");
	}
	
	public void pay() 
	{
		System.out.println("Paying");
	}
	
	public void checkBalance() 
	{
		System.out.println("Checking Balance");
	}
	
	public void showCourses() 
	{
		System.out.println("Your Courses Are:");
		System.out.println("Math");
		System.out.println("English");
		System.out.println("History");
	}
	
	@Override
	public String toString() 
	{
		return "Hello";
	}
	
	//Getters and Setters Encapsulation
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
