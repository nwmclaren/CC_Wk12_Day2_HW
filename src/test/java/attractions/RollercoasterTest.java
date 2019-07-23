package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    people.Visitor visitor1;
    people.Visitor visitor2;
    people.Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(14, 140, 10.00);
        visitor2 = new Visitor(16, 170, 10.00);
        visitor3 = new Visitor(20, 210, 10.00);
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
    public void allowedRollerCoaster() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void notAllowedRollerCoaster() {
        assertEquals(false, rollerCoaster.isAllowedTo((visitor1)));
    }

    @Test
    public void chargesTallPeopleDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.0);
    }

    @Test
    public void chargesSmallPeopleSingle(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.0);
    }
}
