import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class StatisticsCalculatorTest{
	
	@Test
	public void testThatIHaveAnArrayOfNumbersTheLargestIsTheLargestInTheArray(){

//	Given
	int [] numbers = {3, 5, 7,1, 25, 11, 0};

//	When
	int expectedRange = StatisticsCalculator.calculateRangeOf(numbers);

	//int largest = StatisticsCalculator.findLargestNumberIn(numbers);
	int actualRange = 25;

//    Check
	assertEquals(actualRange, expectedRange);

	}

	
	@Test
	public void testThatIHaveAnArrayOfNumbersInMeanIsTheAverageInTheArray(){
    int [] numbers = {3, 5, 7,1, 25, 11, 0};
	int actualAverage = StatisticsCalculator.calculateAverageOf(numbers);
    int expectedAverge = 7;

    //    Check
	assertEquals(actualAverage, expectedAverge);

	
	int [] number = {3, 5, 7,1, 25, 11, 0};
	int actualMedian = StatisticsCalculator.calculateMedianOf(numbers);
    int expectedMedian = 5;
    
//    Check
	assertEquals(actualMedian, expectedMedian);

    
    }
    @Test
	public void testThatIHaveAnArrayOfNumbersDeviationInTheArray(){

	
	int [] numbers = {3, 5, 7,1, 25, 11, 0};
	int actualDeviation = StatisticsCalculator.calculateDeviationOf(numbers);
    int expectedDeviation = StatisticsCalculator.calculateDeviationOf(numbers);;
    
//    Check
	assertEquals(actualDeviation, expectedDeviation);

    
    }
}
