package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
	List<Hotel> hotels = new ArrayList<>();
	
	public boolean addHotel(Hotel hotel) {
		return hotels.add(hotel);
	}


	public static void main(String[] args){

		HotelReservationSystem hotel = new HotelReservationSystem();
		hotel.addHotel(null);
	}

}
