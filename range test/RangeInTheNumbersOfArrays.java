

public class RangeInTheNumbersOfArrays {
public static int RangeInTheNumberOfArray(int[] numbers) {
    return findingTheLargestNumber(numbers) - findingTheSmallestNumber(numbers);
}
    public static int RangeInTheNumberInArray(int[] numbers) {
    return findingTheLargestPostiveNumber(numbers) - findingTheSmallestPostiveNumber(numbers);
        }


        public static int findingTheLargestNumber (int[] numbers)  {
        int theLargestNumber = 0;

        for (int checker = 0; checker < numbers.length; checker++) {
        if (numbers[checker] > theLargestNumber) {
            theLargestNumber = numbers[checker];
        
        }

    }
        return theLargestNumber;
}
    


        public static int findingTheSmallestNumber (int[] numbers)  {
        int theSmallestNumber = 1;

        for (int checker = 0; checker < numbers.length; checker++) {
        if (numbers[checker] < theSmallestNumber) {
            theSmallestNumber = numbers[checker];
        
        }

    }

        return theSmallestNumber;
}
        
        public static int findingTheLargestPostiveNumber (int [] numbers){
        int theLargestPositiveNumber = 0;
        for (int count =0; count < numbers.length; count++) {
        if (numbers[count] > theLargestPositiveNumber) {
            theLargestPositiveNumber = numbers[count];
            }
        }

            return theLargestPositiveNumber;
    }

        
        public static int findingTheSmallestPostiveNumber (int [] numbers) {
        int theSmallestPositiveNumber = 5;
        for (int index = 0; index < numbers.length; index ++) {
        if (numbers[index] > 0 && numbers[index] <= theSmallestPositiveNumber) {
            theSmallestPositiveNumber = numbers[index];
            }
        }
            return theSmallestPositiveNumber;
    }
    
}
