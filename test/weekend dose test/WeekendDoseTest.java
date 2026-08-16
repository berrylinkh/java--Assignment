


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

   
    public class WeekendDoseTest {
    /* @Test
    public void TestingForTheSumOfNumberFromOneToTheNumber (){
    // Given or Arrange
    int number= 5;
    
    //When or Act
    int theExpectedSum = WeekendDose.getTheSumOfNumberFromOneToTheNumber(number);

    //check or Assert
    int theActualSum = 15;


    assertEquals (theActualSum, theExpectedSum);
    }*/
    @Test
    public void utilityAppTest() {
    String[] name = {"aderonke","john", "paul", "lolly"};
    //When or Act
    int theExpectedNameResult = WeekendDose.utilityApp(name);
    //check or Assert
    int theActualNameResult = 4;
    assertEquals (theActualNameResult, theExpectedNameResult);

    }
    @Test
    public void reverseNameTest() {

    String[] name = {"aderonke"};

    //When or Act
    String theExpectedReverseResult = WeekendDose.reverseString(name);
    //check or Assert
    String theActualReverseResult ="eknoreda" ;

    assertEquals (theActualReverseResult, theExpectedReverseResult);

    }
}


