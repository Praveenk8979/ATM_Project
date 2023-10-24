package com.hotel;





public class Handler extends Details  {

	
	static Handler hd;
	
	
	public static Handler getInstance() {
		if (hd != null) {
			return hd;
		}
		hd = new Handler();
		return hd;
	}

	public void dataStructureHandler() {

		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			Handler.getInstance().dataStructureHandler();
			int x = Handler.getInstance().getChoice();
			if (x == 1) {

				dataStructureHandler();
			}
			System.out.println("Do you want any other operation, press y/n ! Go for main manu press m ");
			con = Handler.getInstance().getYesorNo();
			if((con.equals("m") || con.equals("M"))){
				Main.again();
				break;
			}
		}
		if ((con.equals("n") || con.equals("N"))) {
			Main.again();
		}
	}

	public void listDataStructureHandler() {
		String con = "y";
		while ((con.equals("y") || con.equals("Y"))) {
			MssgDetails.getIntance().showmssgDetail();
			int x = Handler.getInstance().getChoice();
			if (x == 1) {
				hotelpricelist();
			} else if (x == 2) {
				hotelbystar();
			}
			System.out.println("Do you want any other information, press y/n");
			con = Handler.getInstance().getYesorNo();
		}
		if ((con.equals("n") || con.equals("N"))) {
			dataStructureHandler();
		}
	}
private void hotelbystar() {
		
		
	}

	private void hotelpricelist() {
		String con="y";
		while((con.equals("y")||con.equals("Y"))) {
			DetailsHnd.DetailOfList.showDetailsList();
			int x= Handler.getInstance().getChoice();
			if(x==1) {
				
			}
		}
		
	}

}

	
		
	

