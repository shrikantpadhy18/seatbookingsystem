
package model;
import java.util.*;
import utilities.Helper.BookStatus;

public class BookingInfo{

    Map<Integer,String> bookingData = new HashMap<>();
    public BookingInfo() {
    bookingData.put(1,BookStatus.UNBOOKED.getMessage());
    bookingData.put(2,BookStatus.UNBOOKED.getMessage());
    bookingData.put(3,BookStatus.UNBOOKED.getMessage());
    bookingData.put(4,BookStatus.UNBOOKED.getMessage());
    bookingData.put(5,BookStatus.UNBOOKED.getMessage());
    bookingData.put(6,BookStatus.UNBOOKED.getMessage());
    }
    public Map<Integer,String> getBookingData(){
        return bookingData;
    }

    public void setBookingData(Map<Integer,String> bookingData){
        this.bookingData = bookingData;
    }
}