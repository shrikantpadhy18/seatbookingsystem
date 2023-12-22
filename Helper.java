package utilities;


public class Helper{

    public enum BookStatus
    {
        BOOKED("ALREADY BOOKED"),UNBOOKED("AVAILABLE FOR BOOKING");

        private String message;

        BookStatus(String message){
            this.message = message;
        }

        public String getMessage(){
            return this.message;
        }
    }

}