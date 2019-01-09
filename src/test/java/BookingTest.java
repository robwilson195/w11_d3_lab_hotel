import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom boudoir;
    private Bedroom honeymoonSuite;
    private Guest guest1;
    private Guest guest2;
    private ArrayList<Guest> guestList;
    private Booking booking1;

    @Before
    public void setUp(){
        this.boudoir = new Bedroom(1,2, 200,"Double");
        this.honeymoonSuite = new Bedroom(2,2,500,"Deluxe");
        this.guest1 = new Guest("Steve");
        this.guest2 = new Guest("Rob:");
        guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        this.booking1 = new Booking(boudoir, guestList, 7);
    }

    @Test
    public void shouldHaveARoom() {
        assertEquals(boudoir, booking1.getBedroom());
    }

    @Test
    public void shouldHaveGuests() {
        assertEquals(guestList, booking1.getGuests());
    }

}
