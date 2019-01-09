import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacilityTest {

    private Facility facility1;

    @Before
    public void before() {
        facility1 = new Facility("Dining Room", 50);
    }

    @Test
    public void facilityHasName() {
        assertEquals("Dining Room", facility1.getName());
    }

    @Test
    public void facilityHasCapacity() {
        assertEquals(50, facility1.getCapacity());
    }

}
