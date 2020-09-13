package com.company;

public class Main {

    public static void main(String[] args) {
		// Create a new class for a bank account
		// Create fields for the account number, balance, customer name, email and phone number.
		//
		// Create getters and setters for each field
		// Create two additional methods
		// 1. To allow the customer to deposit funds (this should increment the balance field).
		// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
		// but not allow the withdrawal to complete if their are insufficient funds.
		// You will want to create various code in the Main class (the one created by IntelliJ) to
		// confirm your code is working.
		// Add some System.out.println's in the two methods above as well.

		// Create a new class VipCustomer
		// it should have 3 fields name, credit limit, and email address.
		// create 3 constructors
		// 1st constructor empty should call the constructor with 3 parameters with default values
		// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
		// 3rd constructor should save all fields.
		// create getters only for this using code generation of intellij as setters wont be needed
		// test and confirm it works.

		BankAccount NinadAccount = new BankAccount();
		NinadAccount.setAccountNumber("2345");
		NinadAccount.setBalance(500);
		NinadAccount.setCustomerName("Ninad Patil");
		NinadAccount.setEmail("ninadpatil1452@gmail.com");
		NinadAccount.setPhoneNumber("9987328505");
		NinadAccount.withdrawFunds(100);
		NinadAccount.depositFunds(500);
		VipCustomer aadesh = new VipCustomer();
		System.out.println(aadesh.getName());
		VipCustomer sairaj = new VipCustomer("sairaj","sairajlovescs@gmal.com");
		System.out.println(sairaj.getCreditLimit());
		System.out.println(sairaj.getName());
		VipCustomer ninad = new VipCustomer("ninad",4000,"ninadpatil1452@gmail.com");
		System.out.println(ninad.getName());
    }
}
