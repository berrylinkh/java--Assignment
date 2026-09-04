
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class SumTheNumbersTest {

    @Test
    public void countTheLengthoOfTheArray () {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    int expectedResult = SumTheNumbers.countElementInTheArray (numbers);
    int actualResult = 7;

    assertEquals (actualResult , expectedResult);
    }

    @Test
    public void addTwoNumbersEachInTheArrayAndReturnAnArray () {
    int[] numbers = {1, 2, 3, 4, 5, 6};
    int[] expectedResult = SumTheNumbers.addTwoNumbersEachInTheArrayAndReturnAnArray (numbers);
    int[] actualResult = {3, 7, 11};

    assertArrayEquals (actualResult , expectedResult);
    }
    
}
