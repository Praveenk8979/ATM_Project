package com.ATM;

public class BankAcount {
	private double balance;

	public BankAcount(double initialbalance) {
		balance = initialbalance;
	}

	

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance-amount;
			return true;
		}
		return false;
	}

}
