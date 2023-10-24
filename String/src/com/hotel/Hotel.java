package com.hotel;

public class Hotel {

	public int pricePerNight;
	public int rating;
	public HotelType hoteltype;
	public Hotel(int pricePerNight, int rating, HotelType hoteltype) {
		super();
		this.pricePerNight = pricePerNight;
		this.rating = rating;
		this.hoteltype = hoteltype;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public HotelType getHoteltype() {
		return hoteltype;
	}
	public void setHoteltype(HotelType hoteltype) {
		this.hoteltype = hoteltype;
	}
	@Override
	public String toString() {
		return "Hotel [pricePerNight=" + pricePerNight + ", rating=" + rating + ", hoteltype=" + hoteltype + "]";
	}
	
	
}
