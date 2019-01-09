import java.util.ArrayList;

public class Booking {
    private  Bedroom bedroom;
    private  ArrayList<Guest> guests;
    private int numberNights;

    public Booking(Bedroom bedroom, ArrayList<Guest> guests, int nights) {
        this.bedroom = bedroom;
        this.guests = guests;
        this.numberNights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getNumberNights() {
        return numberNights;
    }
}
