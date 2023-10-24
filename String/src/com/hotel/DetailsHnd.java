package com.hotel;



public class DetailsHnd {
      
	static DetailsHnd DetailOfList;

	public static DetailsHnd getInstance() {
		if (DetailOfList != null) {
			return DetailOfList;
		}
		DetailOfList = new DetailsHnd();
		return DetailOfList;
	}

	public void showDetailsList() {
		System.out.println("Select one Hotel Details ");
		System.out.println("1. Price ");
		System.out.println("2. ByStar");
		

	}

	

}


