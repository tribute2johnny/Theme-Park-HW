package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;


import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollerCoaster() {
        Visitor visitor = new Visitor(16, 160, 20.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void tallPeoplePayDouble() {
        Visitor visitor = new Visitor(20, 210, 30.00);
        assertEquals(16.80, rollerCoaster.tallPayDouble(visitor), 0.0);
    }
}
