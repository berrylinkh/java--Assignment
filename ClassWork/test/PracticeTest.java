import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PracticeTest {

    @Test
    public void testICollectAnArray_IReturnTheSquareOfEach () {

        int [] number = {3, 5, 2, 6};

        int [] expected = {9, 25, 4, 36};

        int [] actual = Practice.getSquare(number);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals( actual, expected);

    }

    @Test
    public void testThatEachNumberIsGreaterThan100AndLessThan1000 () {

        int [] number = {2000, 5, 2, 6};

        assertThrows(IllegalArgumentException.class, () -> Practice.getSquare(number));
    }

    @Test
    public void testICollectAnArray_IReturnTheSquareOfEachInOrder () {

        int [] number = {-3, 5, 2, 6};

        int [] expected = {4, 9, 25, 36};

        int [] actual = Practice.getSquare(number);

        assertArrayEquals( actual, expected);

    }
}
