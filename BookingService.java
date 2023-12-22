package service;
import model.User;

public interface BookingService{

    public void book(User user,int seatNumber);
    public void getAvailableSeats();


}