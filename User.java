
package model;
import java.util.*;

public class User{
    String name;
    String email;
    Map<String, List<Integer>> seatInfo = new HashMap<>();

    public User(String name,String email){
        this.name = name;
        this.email = email;
    }

    public void addToBookingList(int seat){
        List<Integer> bookedSeats = seatInfo.getOrDefault(this.email,new ArrayList<>());
        bookedSeats.add(seat);
        seatInfo.put(this.email,bookedSeats);
    }
    
    public List<Integer> getUserBookedSeats(){
        return seatInfo.get(this.email);
    }
}