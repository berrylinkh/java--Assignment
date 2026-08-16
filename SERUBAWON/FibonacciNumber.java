 import java.util.Arrays;
    public class FibonacciNumber {
    public static void main (String []args) {

        int number = 8;
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber= 0;
 
            for (int check = 1; check <= number; check ++) {
            System.out.print (firstNumber + ", ");

            nextNumber= firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
         }
        }


    }
