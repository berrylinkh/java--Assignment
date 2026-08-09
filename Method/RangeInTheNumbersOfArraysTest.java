




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    @Test

    public void RangeInTheNumbersOfArrays() {
    
    // Given
    int[] arraysOfNumbers = {2, 5,1 ,9, 7};

    // when 
    int theexpectedRangeResultForLargestNumber = RangeInTheNumberOfArray(numbers);

    // check
    int theActualRangeResultForLargestNumber= 9;

    assertEquals (theActualRangeResultForLargestNumber,theexpectedRangeResultForLargestNumber);

}


@Test

    public void RangeInTheNumbersOfArrays() {
    
    // Given
    int[] arraysOfNumbers = {2, 5,1 ,9, 7};

    // when 
    int theexpectedRangeResultForSmallestestNumber = RangeInTheNumberOfArray(numbers);

    // check
    int theActualRangeResultForSmallestNumber= 1;

    assertEquals (theActualRangeResultForSmallestNumber,theexpectedRangeResultForSmallestNumber);

}

