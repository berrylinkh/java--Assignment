import java.util.Arrays;

public class ArrayOfNumbers{
public static void main (String...args) {
//int[] numbers = new int [6];
            int[] number = {12, 10, 17, 14, 1, 5};
            System.out.println(Arrays.toString(descendNumber(number)));

}
   
public static int[] descendNumber(int[] numbers){

        
    int arrayOfNumber = 0;
//    int[] newArrayOfNumber = 0;

    for(int num = 0; num < numbers.length; num++) {
        for(int index = 0; index < numbers.length; index++) {
                if (numbers[num] > numbers[index]) {
                    arrayOfNumber = numbers[num];
                    numbers[num] = numbers[index];
                    numbers[index] = arrayOfNumber;
                    }
                  }
            }
   
            return numbers;  
    }      
} 
    
    
