package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0,0.01);
		acc2.withdraw(200.00);
		
		
		Account acc3 = new BussinessAccount(1003,"Carol", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}
	

}