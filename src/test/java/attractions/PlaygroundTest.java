package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    people.Visitor visitor1;
    people.Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(12, 150, 10.00);
        visitor2 = new Visitor(16, 170, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void notAllowedEntry(){
        assertEquals(false,playground.isAllowedTo(visitor2));
    }
}
