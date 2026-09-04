
public class ArrayOfNumbers {
public static int[] ReturnZeroForOddAndOneForEvenNumbers (int[] numbers) {

    for (int index = 0; index < numbers.length; index ++) {
    if (numbers[index] % 2 == 0) {
        numbers[index] = 1;    
        }
     else if (numbers[index] % 2 !=0) {
        numbers[index] = 0;    
        }
     }
        return numbers;
}

    public static boolean[] ReturnTRueForOddAndOneForEvenFalse (int[] numbers) {
    boolean[] newArray = new boolean[numbers.length];

    for (int index = 0; index < numbers.length; index ++) {
    if (numbers[index] % 2 == 0) {
        newArray[index] = false;    
        }
     else if (numbers[index] % 2 !=0) {
        newArray[index] = true;    
        }
     }
        return newArray; 
    }
}
