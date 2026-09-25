
public class CreditCard {
    public int countCreditCardNumber(String cardInput) {
        int counter = 0;
        for (int count = 0; count < cardInput.length(); count++) {
            counter++;
        }
        return counter;
    }

    public int[] convertCardNumberIntoAntArray(String cardConverterInput) {
        int[] cardArray = new int[cardConverterInput.length()];
        for (int count = 0; count < cardConverterInput.length(); count++) {
            cardArray[count] = Integer.parseInt(String.valueOf(cardConverterInput.charAt(count)));
        }
        return cardArray;
    }

    public String checkCreditCardType(int[] cardInput) {
        if (cardInput[0] == 4) {
            return "MasterCard";
        } else if (cardInput[0] == 5) {
            return "Visa Card";
        } else if (cardInput[0] == 3 && cardInput[1] == 7) {
            return "American express Card";
        } else if (cardInput[0] == 6) {
            return "Discover Card";
        } else {
            return "Invalid Card";
        }
    }

    public int[] doubleSecondDigitOfTheCard(int[] cardInput) {
        for (int index = cardInput.length - 2; index >= 0; index -= 2) {
            int doubleNumber = cardInput[index] * 2;
            if (doubleNumber > 9) {
                doubleNumber = (doubleNumber / 10) + (doubleNumber % 10);
            }
            cardInput[index] = doubleNumber;
        }
        return cardInput;
    }

    public int addAllTheNumbersAfterItHasBeenDoubled(int[] cardInput) {
        int sum = 0;
        for (int index = cardInput.length - 2; index >= 0; index -= 2) {
            sum += cardInput[index];
        }
        return sum;
    }

    public int addAllTheNumbersInOddIndex(int[] cardInput) {
        int sum = 0;
        for (int index = cardInput.length - 1; index >= 0; index -= 2) {
            sum += cardInput[index];
        }
        return sum;
    }

    public int addDoubleAndOddTotalInOdd(int[] cardInput) {
        int totalResult = addAllTheNumbersAfterItHasBeenDoubled(cardInput) + addAllTheNumbersInOddIndex(cardInput);
        return totalResult;
    }

    public String returnCreditCardValidity(String cardCount,int[] cardInput) {
        int cardCounter = countCreditCardNumber(cardCount);
        int cardDigitSum = addDoubleAndOddTotalInOdd(cardInput);
        if (cardCounter == 13 || cardCounter == 16 && cardDigitSum % 10 == 0) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
}

