import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CreditCard creditCard = new CreditCard();
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Hello, Kindly enter your card details to verify: ");
        String userCardNumber = inputCollector.nextLine();
        int[] cardConversion =creditCard.convertCardNumberIntoAntArray(userCardNumber);
        System.out.println("Credit Card Type: "+creditCard.checkCreditCardType(cardConversion));
       System.out.println("Card Number: "+userCardNumber);
       System.out.println("Credit card digit length: "+creditCard.countCreditCardNumber(userCardNumber));
       System.out.println( "Credit card Status: "+creditCard.returnCreditCardValidity(userCardNumber,cardConversion));

    }
}
