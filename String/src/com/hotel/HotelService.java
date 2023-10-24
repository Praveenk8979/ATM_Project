package com.hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
	
	List<Hotel> hotels=new ArrayList<>();
	
	public HotelService() {
		hotels.add(new Hotel(2000,2,HotelType.THREE_STAR));
		hotels.add(new Hotel(20000,1,HotelType.FIVE_STAR));
		hotels.add(new Hotel(5000,4,HotelType.FOUR_STAR));
		hotels.add(new Hotel(3000,5,HotelType.THREE_STAR));
		hotels.add(new Hotel(10000,3,HotelType.FIVE_STAR));
	}
	private boolean HotelLess(int price, Hotel hotel) {
		
		return hotel.getPricePerNight()<=price;
	}
	
	public List<Hotel> filterHotelslessThan(int price)
	
	
	{
		
  		List<Hotel> filteredHotels=new ArrayList<>();
		for(Hotel hotel: hotels) {
			if(HotelLess(price,hotel)) {
				filteredHotels.add(hotel);				
			}else {
				this.hotels.add(hotel);
			}
		}
		return filteredHotels;
		
	}
	private boolean HotelBystar(Hotel hotel) {
		
		return hotel.getHoteltype()==HotelType.FIVE_STAR;
	}
    public List<Hotel> filterHotelByStar(){
     List<Hotel> filteredHotels =new ArrayList<>();
     
     for(Hotel hotel: hotels) {
    	 if(HotelBystar(hotel)) {
    		 filteredHotels.add(hotel);
    	 }
     }
     
	return filteredHotels;
	
    }
private boolean HotelBystar1(Hotel hotel) {
		
		return hotel.getHoteltype()==HotelType.FOUR_STAR;
	}
    public List<Hotel> filterHotelByStar1(){
     List<Hotel> filteredHotels =new ArrayList<>();
     
     for(Hotel hotel: hotels) {
    	 if(HotelBystar1(hotel)) {
    		 filteredHotels.add(hotel);
    	 }
     }
     
	return filteredHotels;
	
    }
private boolean HotelBystar2(Hotel hotel) {
		
		return hotel.getHoteltype()==HotelType.THREE_STAR;
	}
    public List<Hotel> filterHotelByStar2(){
     List<Hotel> filteredHotels =new ArrayList<>();
     
     for(Hotel hotel: hotels) {
    	 if(HotelBystar2(hotel)) {
    		 filteredHotels.add(hotel);
    	 }
     }
     
	return filteredHotels;
	
    }
	

}
