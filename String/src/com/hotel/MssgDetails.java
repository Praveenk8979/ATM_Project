package com.hotel;



public class MssgDetails {
	static MssgDetails md;

	public static MssgDetails getIntance() {
		if (md != null) {
			return md;
		}
		md =new MssgDetails();
		return md;
	}
	
	public void showmssgDetail() {
		System.out.println("Select one Price ");
		System.out.println("2000");
		System.out.println("20000");
		System.out.println("5000");
		System.out.println("3000");
		System.out.println("10000");

		
	}
	
	

}
