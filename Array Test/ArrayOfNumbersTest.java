
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class ArrayOfNumbersTest {

    @Test
    public void testThatReturnZeroForOddAndOneForEvenNumbers () {
    int[] numbers = {3,5,2,8,1,5};
    int[] expectedResult = ArrayOfNumbers.ReturnZeroForOddAndOneForEvenNumbers (numbers);
    int[] actualResult = {0, 0, 1,1,0,0};

    assertArrayEquals (actualResult , expectedResult);
    }

    @Test
    public void testThatReturnTrueForOddAndFalseForEven () {
    int[] numbers = {3,5,2,8,1,5};
    boolean[] expectedResult = ArrayOfNumbers.ReturnTRueForOddAndOneForEvenFalse (numbers);
    boolean[] actualResult = {true, true, false,false, true,true};

    assertArrayEquals (actualResult , expectedResult);
    }
}
