package com.ATM;

public class Main {

	public static void main(String[] args) {
		double initialbalance=10000.0; //Initial balance in the bank
		BankAcount userAccount= new BankAcount(initialbalance);
		ATM atm=new ATM(userAccount);
		System.out.println("Welcome to the ATM!");
		atm.run();
	}

	

}
