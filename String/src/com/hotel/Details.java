package com.hotel;

import java.util.Scanner;

public class Details {

	static Details dl;
	private Scanner sc;

	public Details() {
		sc = new Scanner(System.in);

	}

	public static Details getInstance() {
		if (dl != null) {
			return dl;
		}
		dl = new Details();
		return dl;
	}

	public String getNewRecord() {
		return sc.next();
	}

	public int getChoice() {
		
		int x;
		try {
			x = sc.nextInt();
		} catch (Exception e) {
			x = getChoice();
		}
		return x;
	}

	public String getYesorNo() {
		String choice2;
		String choice = this.sc.next();
		if (choice.equals("y") || choice.equals("Y") || choice.equals("n") || choice.equals("N") || choice.equals("m")
				|| choice.equals("M")) {
			choice2 = choice;
		} else {
			System.out.println("Your key is wrong please press y/n");
			choice2 =getYesorNo();
		}
		return choice2;

	}

}
