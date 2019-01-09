import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

	private Bedroom boudoir;
	private Bedroom honeymoonSuite;

	@Before
	public void setUp() {
		this.boudoir = new Bedroom(new Integer(1),new Integer(2),new Float(200.0),"Double");
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
}
