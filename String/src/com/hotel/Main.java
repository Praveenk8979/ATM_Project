package com.hotel;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("*****  Welcome *****");
		DetailsHnd.getInstance().showDetailsList();
	}
	public static void again() {
		DetailsHnd.getInstance().showDetailsList();
	}

}
