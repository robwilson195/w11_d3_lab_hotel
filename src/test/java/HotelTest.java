import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom boudoir;
    private Bedroom honeymoonSuite;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guestList;
    private Hotel hotel;
    private Facility gym;
    private Facility bar;


    @Before
    public void setUp() {
        this.gym = new Facility("Gym",20);
        this.bar = new Facility("Hotel Bar", 30);
        this.boudoir = new Bedroom(1,2, 200,"Double");
        this.honeymoonSuite = new Bedroom(2,2,500,"Deluxe");
        this.guest1 = new Guest("Steve");
        this.guest2 = new Guest("Rob:");
        guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        this.hotel = new Hotel("The Scotsman");
    }

    @Test
    public void hasName() {
        assertEquals("The Scotsman", hotel.getName());
    }

    @Test
    public void hasNoRooms() {
        assertEquals(0, hotel.getBedrooms().size());
    }

    @Test
    public void hasNoFacilities() {
        assertEquals(0, hotel.getFacilities().size());
    }

    @Test
    public void hasNoBookings() {
        assertEquals(0, hotel.getBookings().size());
    }

    @Test
    public void canAddRoom() {
        hotel.addRoom(honeymoonSuite);
        assertEquals(1, hotel.getBedrooms().size());
        assertEquals(honeymoonSuite, hotel.getBedrooms().get(0));
    }

    @Test
    public void canAddFacility() {
        hotel.addFacility(bar);
        hotel.addFacility(gym);
        assertEquals(2,hotel.getFacilities().size());
    }

    @Test
    public void canGetVacantRooms() {
        hotel.addRoom(honeymoonSuite);
        hotel.addRoom(boudoir);
        assertEquals(2, hotel.getVacantRooms().size());
    }

    @Test
    public void canCheckInGuest() {
        hotel.addRoom(boudoir);
        hotel.checkInGuests(boudoir, guestList);
        assertEquals(true, boudoir.isOccupied());

    }

    @Test
    public void canNotCheckInGuestOverCapacity() {
        Guest third = new Guest("Paul");
        guestList.add(third);
        hotel.addRoom(boudoir);
        hotel.checkInGuests(boudoir, guestList);
        assertEquals(false, boudoir.isOccupied());
    }

    @Test
    public void vacantRoomsGoesDownAfterCheckin() {
        hotel.addRoom(honeymoonSuite);
        hotel.addRoom(boudoir);
        hotel.checkInGuests(boudoir, guestList);
        assertEquals(1, hotel.getVacantRooms().size());
    }

}

