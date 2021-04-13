package oop;

public class BanAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account >> Instantiate a new object
		BankAccount acc1 = new BankAccount();
		
		//Do it with encapsulation
		//acc1.name = "Roger Hue";
		
		acc1.accountNumber = "012345678";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		acc1.setName("Roger Hue");
		acc1.setSsn("3847429553");
		System.out.println(acc1.getSsn());
		System.out.println(acc1.getName());
		
		//Polymorphism through overloading
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "012345679";

		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0123456766";
//		//acc3.checkBalance();
//		
//		CDAccount cd1 = new CDAccount();
//		cd1.balance = 3000;
//		cd1.interestRate = "4.5";
//		cd1.name = "Juan";
//		cd1.accountType = "CD Account";
//		System.out.println(cd1.toString());
//		cd1.compound();
	}
}
