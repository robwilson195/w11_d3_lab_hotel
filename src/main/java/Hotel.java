import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Facility> facilities;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name) {
        this.name = name;
        this.facilities = new ArrayList<>();
        this.bedrooms = new ArrayList<>();
        this.bookings = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Facility> getFacilities() {
        return facilities;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void addRoom(Bedroom room) {
        this.bedrooms.add(room);
    }

    public void addFacility(Facility facility) {
        this.facilities.add(facility);
    }


}
