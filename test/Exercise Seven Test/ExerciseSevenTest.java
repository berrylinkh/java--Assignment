

    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

    public class ExerciseSevenTest{
    
    @Test
    public void reversingTheNumberInTheArray() {
    int[] arrayNumber = {1,2,3,4,5,6,7,8,9,10};
    int[] expectedArrayReverse = ExerciseSeven.reverseTheNumberInTheArray(arrayNumber);
    int[] actualArrayReverse = {10,9,8,7,6,5,4,3,2,1};
    assertArrayEquals (actualArrayReverse,expectedArrayReverse);
    }

    
//    @Test
//    public void countingTheOccuranceNumber() {
//    int[] number = {1,3,3,4,4,8,8,};
//    int[] expectedOccuranceNumber = ExerciseSeven.gettingCountTheOccuranceNumber(number);
//    int actualOccuranceNumber = {1,2,2,2};
//    assertArrayEquals (actualOccuranceNumber ,expectedOccuranceNumber);
//    }

     @Test
    public void comparingTwoArray() {
    int[] arrayNumberOne = {5,2,5,6,1,6};
    int[] arrayNumberTwo = {5,2,5,6,1,6};
    boolean expectedComparisiumResult = ExerciseSeven.ComparisiumResultOfArray(arrayNumberOne, arrayNumberTwo );
    boolean actualComparisiumResult = true;
    assertEquals (actualComparisiumResult,expectedComparisiumResult);
    }
    @Test
    public void comparingTheElementInArrays() {
    int[] arrayNumberOne = {5,2,5,6,1,6};
    int[] arrayNumberTwo = {5,2,5,6,1,6};
    boolean expectedcomparingTheElementResult = ExerciseSeven.comparingTheElementArrays(arrayNumberOne, arrayNumberTwo );
    boolean actualcomparingTheElementResult = true;
    assertEquals (actualcomparingTheElementResult,expectedcomparingTheElementResult);
    }

    @Test
    public void isConcecutiveFour() {
    int[] arrayNumberOne = {3, 4, 5, 5, 6,5, 5, 4, 5};
    boolean expectedIsConcecutiveFourResult = ExerciseSeven.checkingIsConcecutiveFourInTheArrays(arrayNumberOne);
    boolean actualIsConcecutiveFourResult = true;
    assertEquals (actualIsConcecutiveFourResult,expectedIsConcecutiveFourResult);
    }
}
