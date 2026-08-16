
    import java.util.Arrays;
    public class FibonacciNumber {

        public static int[] returningFibonacciAsArray(int  numbers) {
        int[] number = new int [numbers];
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber= 0;
 
            for (int check = 0; check < number.length; check ++) {
            number[check] = firstNumber;
            nextNumber= firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
            return number;
    }
        public static int[][] returningTwinPrime (int numbers) {
        int[] arrayNumbers = new int [5][2]
        int counter =0;
        
            for(int checker =0; checker <=20; checker ++) {
            counter =0;

                for(int check = 0; check <= checker; check++) {
                    if (checker % check ==0) {
                    coounter ++
                    }
                }
            }
           if (counter == 2);
           return arrayNumber[[count]];
    }

}



 
