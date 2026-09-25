
import java.util.Arrays;
public class FibonacciNumber {
//public static int returningFibonacciInArray (int [] numbers) {
//    return number ;
//    }
//

public static int[] returningFibonacciAsArray(int  numbers) {
int[] number = new int [numbers];
int firstNumber = 0;
int secondNumber = 1;
int nextNumber= 0;
 
    for (int check = 1; check <= number.length; check ++) {
        number[check] = firstNumber;
        nextNumber= firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextNumber;
     }
        return number;
}


}
