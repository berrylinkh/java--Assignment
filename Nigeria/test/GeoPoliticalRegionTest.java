import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalRegionTest {
    Nigeria nigeria;
    @BeforeEach
    void setup(){
        nigeria = new Nigeria();
    }
    @Test
    public void testThatGetRegionOfAState(){
        String state = "lagos";
        String expected = nigeria.getState(state);
        String actual = "SOUTH_WEST";
        assertEquals(actual, expected);
    }
//    @Test
//    public void testThatGetRegionOfAState() {
//        String state = "ghana";
//        string expected = nigeria.GeoPoliticalRegion(state);
//        String actual = "state not found";
//        assertThrows(actual, expected);
//    }
}
