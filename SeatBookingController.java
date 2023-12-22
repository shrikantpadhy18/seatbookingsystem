package controller;

import model.*;
import service.*;


public class SeatBookingController{

    BookingService bookService = new BookingServiceImpl();
    BookingInfo bookinfo;

    public void bookSeat(User user,int seatid){
        
        bookService.book(user,seatid);
    }

    public void getAvailableSeats(){
        bookService.getAvailableSeats();
    }

}
