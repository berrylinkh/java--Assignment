import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {
    private CreditCard creditCard;

    @BeforeEach
    public void creditCardValidation() {
        creditCard = new CreditCard();
    }
    @Test
    public void testThatCountCreditCardNumber() {
        String cardInput= "4388576018402626";
        int expectedResult = creditCard.countCreditCardNumber(cardInput);
        int actualResult = 16;
        assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testThatConvertCardNumberIsConvertedIntArray() {
        String cardInput= "4388576018402626";
        int[] expectedResult = creditCard.convertCardNumberIntoAntArray(cardInput);
        int[] actualResult = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    public void testThatCreditCardType() {
        int[] cardInput= {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        String expectedResult = creditCard.checkCreditCardType(cardInput);
        String actualResult = "MasterCard";
        assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testThatDoubleSecondDigitOfTheCard() {
        int[] cardInput= {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
        int[] expectedResult = creditCard.doubleSecondDigitOfTheCard(cardInput);
        int[] actualResult = {8,3,7,8,1,7,3,0,2,8,8,0,4,6,4,6};
        assertArrayEquals(actualResult, expectedResult);
    }
    @Test
    public void testThatAddAllTheNumbersAfterItHasBeenDoubled() {
        int[] cardInput= {8,3,7,8,1,7,3,0,2,8,8,0,4,6,4,6};
        int expectedResult = creditCard.addAllTheNumbersAfterItHasBeenDoubled(cardInput);
        int actualResult = 37;
        assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testThatAddAllTheNumbersInOddIndex() {
        int[] cardInput= {8,3,7,8,1,7,3,0,2,8,8,0,4,6,4,6};
        int expectedResult = creditCard.addAllTheNumbersInOddIndex(cardInput);
        int actualResult = 38;
        assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testThatAddDoubleAndOddTotalInOdd() {
        int[] cardInput = {8,3,7,8,1,7,3,0,2,8,8,0,4,6,4,6};
        int expectedResult = creditCard.addDoubleAndOddTotalInOdd(cardInput);
        int actualResult = 75;
        assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testThatReturnCreditCardValidity() {
        String cardCount= "8378173028804646";
        int[] cardInput= {8,3,7,8,1,7,3,0,2,8,8,0,4,6,4,6};
        String expectedResult = creditCard.returnCreditCardValidity(cardCount,cardInput);
        String actualResult = "Invalid";
        assertEquals(actualResult, expectedResult);
    }
}
