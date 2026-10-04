import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSneakySevenTest {
    @Test
    public void testThatCountSneakySeven(){
       int  givenNumber = 50;
       int expected = CountSneakySeven.countSneakySeven(givenNumber);
       int actual = 10;
       assertEquals(actual, expected);
    }
}
