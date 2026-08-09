

public class RangeOfNumbersOfArray.java {
public static int RangeInTheNumberOfArray(int [] numbers) {
    return theLargestNumber - theSmallestNumber;
        }


    public static int findingTheLargestNumber (int [] numbers)  {
    int theLargestNumber = 0;

        for (int checker = 0; checker < numbers.length; checker ++) {
        if (numbers[checker] > largestNumber) {
            theLargestNumber = number[checker];
        
        }

    }
        return theLargestNumber;
}
    


    public static int findingTheSmallestNumber (int [] numbers)  {
    int theSmallestNumber = 0;

        for (int checker = 0; checker < numbers.length; checker ++) {
        if (numbers[checker] < theSmallestNumber) {
            theSmallestNumber = number[checker];
        
        }

    }
        return theSmallestNumber;
}
}
