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


    @Before
    public void setUp() {
        this.boudoir = new Bedroom(new Integer(1),new Integer(2),new Float(200.0),"Double");
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


}
