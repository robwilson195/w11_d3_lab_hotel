import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BedroomTest {

	private Bedroom boudoir;
	private Bedroom honeymoonSuite;
	private Guest guest1;
	private Guest guest2;
	private ArrayList<Guest> guestList;

	@Before
	public void setUp() {
		this.boudoir = new Bedroom(new Integer(1),new Integer(2),new Float(200.0),"Double");
		this.guest1 = new Guest("Steve");
		this.guest2 = new Guest("Rob:");
		guestList = new ArrayList<>();
		guestList.add(guest1);
		guestList.add(guest2);
	}

	@Test
	public void checkRoomHasNumber() {
		assertEquals(1, boudoir.getRoomNumber());
	}

	@Test
	public void checkRoomHasCapacity() {
		assertEquals(2, boudoir.getCapacity());
	}

	@Test
	public void checkRoomHasNightlyRate() {
		assertEquals(200.0f, boudoir.getNightlyRate(), 0.01);
	}

	@Test
	public void checkRoomHasType() {
		assertEquals("Double", boudoir.getType());
	}

	@Test
	public void checkRoomStartsEmpty() {
		assertEquals(0, boudoir.getGuests().size());
	}

	@Test
	public void canCheckOccupancyFalse() {
		assertEquals(false, boudoir.isOccupied());
	}


	@Test
	public void canAddGuests() {
		boudoir.addGuestsToRoom(guestList);
		assertEquals(2, boudoir.getGuests().size());
		assertEquals(guestList, boudoir.getGuests());
		ArrayList<Guest> experiment = boudoir.getGuests();
		experiment = new ArrayList<>();
		System.out.println("Break");
		//TODO: Ask about reference/value passing
	}

	@Test
	public void canCheckOccupancyTrue() {
		boudoir.addGuestsToRoom(guestList);
		assertEquals(true, boudoir.isOccupied());
	}

	@Test
	public void canRemoveGuests() {
		boudoir.addGuestsToRoom(guestList);
		assertEquals(true, boudoir.isOccupied());
		ArrayList<Guest> removedGuests = boudoir.removeGuestsFromRoom();
		assertEquals(false, boudoir.isOccupied());
		assertEquals(guestList, removedGuests);
	}
}
