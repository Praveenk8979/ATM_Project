package com.ATM;

import java.util.*;

public class ATM {
	private BankAcount account;

	public ATM(BankAcount account) {
		this.account = account;
	}

	public void displayMenu() {
		System.out.println("ATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			displayMenu();
			System.out.println("Enter your choice (1/2/3/4): ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Your balance is: Rs" + account.getBalance());
				break;
			case 2:
				System.out.println("Enter the deposit amount : Rs");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				System.out.println("Deposit successful. New balance: Rs" + account.getBalance());
				break;
			case 3:
				System.out.println("Enter the withdraw amount: Rs");
				double withdrawAmount = sc.nextDouble();
				boolean success = account.withdraw(withdrawAmount);
				if (success) {
					System.out.println("Withdraw successfull. New balance: Rs" + account.getBalance());
				} else {
					System.out.println("Withdraw failed. Insufficient funds.");
				}
				break;
			case 4:
				exit = true;
				System.out.println("Thank you for using the ATM. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a valid option (1/2/3/4).");
			}
		}
		sc.close();
	}
}
