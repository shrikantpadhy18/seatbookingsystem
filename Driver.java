import controller.SeatBookingController;

import model.User;


public class Driver{

    public static void main(String [] args){
        SeatBookingController object = new SeatBookingController();
        User user = new User("Shrikant","shrikantpadhy18@gmail.com");

        object.getAvailableSeats();
        System.out.println("-------------------------------------------");
        object.bookSeat(user,1);
        object.bookSeat(user,2);
        object.bookSeat(user,3);

        object.getAvailableSeats();
        user.getUserBookedSeats().stream().forEach(n-> System.out.println(n));
    }
}