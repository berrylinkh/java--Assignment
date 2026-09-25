import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class StatisticsCalculatorTest{
	
	@Test
	public void testThatIHaveAnArrayOfNumbersTheLargestIsTheLargestInTheArray(){

	//Given
	int [] numbers = {3, 5, 7,1, 25, 11, 0};

	//When
	int expectedRange = StatisticsCalculator.calculateRangeOf(numbers);

	int largest = StatisticsCalculator.findLargestNumberIn(numbers);
	int actualRange = 25;

	//Check
	assertEquals(actualRange, expectedRange);



	}
	

}
