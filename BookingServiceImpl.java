
package service;
import model.*;
import utilities.Helper.BookStatus;
import java.util.*;

public class BookingServiceImpl implements BookingService{
    private BookingInfo info = new BookingInfo();
    private Object lock = new Object();
    public void book(User user,int seatNumber){
        

        Map<Integer,String> status =  info.getBookingData();
        
        synchronized(lock){
            status.put(seatNumber,BookStatus.BOOKED.getMessage());
            info.setBookingData(status);
            user.addToBookingList(seatNumber);
        }

    }

    public void getAvailableSeats(){
        Map<Integer,String> status =  info.getBookingData();

        for(Map.Entry<Integer,String> mp : status.entrySet()){
            System.out.println(mp.getKey() + "   ------>   " + mp.getValue());
        }
    }

}