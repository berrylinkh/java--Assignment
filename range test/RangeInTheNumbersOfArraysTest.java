



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class RangeInTheNumbersOfArraysTest {

    @Test
    
    public void rangeInTheNumbersOfArrays() {
    
    // Given
    int[] numbers = {2, 5, 1 ,9, 7};

    // when 
    int theExpectedRangeResultForLargestNumber = RangeInTheNumbersOfArrays.findingTheLargestNumber(numbers);

    // check
    int theActualRangeResultForLargestNumber= 9;

    assertEquals (theActualRangeResultForLargestNumber,theExpectedRangeResultForLargestNumber);

}


    @Test

    public void RangeInTheNumbersOfArrays() {
    
    // Given
    int[] numbers = {2, 5, 1 ,9, 7};

    // when 
    int theExpectedRangeResultForSmallestNumber = RangeInTheNumbersOfArrays.findingTheSmallestNumber(numbers);

    // check
    int theActualRangeResultForSmallestNumber= 1;

    assertEquals (theActualRangeResultForSmallestNumber,theExpectedRangeResultForSmallestNumber);

}
    @Test

    public void RangeOfPositiveNumbersForLargestInArrays() {
    
    // Given
    int[] numbers = {-2, -1, 5, 10 , 7};

    // when 
    int theExpectedRangeResultForLargestPositiveNumber = RangeInTheNumbersOfArrays.findingTheLargestPostiveNumber(numbers);

    // check
    int theActualRangeResultForLargestPositiveNumber= 10;

    assertEquals (theActualRangeResultForLargestPositiveNumber, theExpectedRangeResultForLargestPositiveNumber);

    }
     @Test

    public void RangeOfPositiveNumbersForSmallestInArrays() {
    
    // Given
    int[] numbers = {-2, -1, 5, 10 , 7};

    // when 
    int theExpectedRangeResultForSmallestPositiveNumber = RangeInTheNumbersOfArrays.findingTheSmallestPostiveNumber(numbers);

    // check
    int theActualRangeResultForSmallestPositiveNumber= 5;

    assertEquals (theActualRangeResultForSmallestPositiveNumber, theExpectedRangeResultForSmallestPositiveNumber);

   }
}
