


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

   public class FibonacciNumberTest {

   @Test
   public void FibonacciNumberForTest () {
   int  numbers = 8;
   int [] theActualArrayNumber  = {0, 1, 1, 2, 3, 5, 8,13}; 
   int [] theExpectedArrayNumber = FibonacciNumber.returningFibonacciAsArray(numbers) ;

  assertArrayEquals (theActualArrayNumber, theExpectedArrayNumber);

    
 }
}
