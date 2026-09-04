

public class SumTheNumbers {
   
    public static int[] addTwoNumbersEachInTheArrayAndReturnAnArray (int[] numbers) {

    int counter = 0;
    int sum =0;
    int count = 0;
    int [] newArray = new int[3] ;
    if (numbers.length % 2 ==0) {
        newArray = new int[numbers.length/2];
        }
    else if (numbers.length % 2 !=0) {
        newArray = new int[(numbers.length/2) +1];   
    }
    

    for (int index = 0; index < numbers.length; index++) {
    sum += numbers[index];
    counter ++;
    if (counter == 2 && numbers.length % 2 ==0) {
        newArray[count] = sum;
        count++;
        sum = 0;
        counter =0;
           }
     else if (counter == 2 && numbers.length % 2 !=0) {
        newArray[count] = sum;
        count++;
        sum = 0;
        counter =0;
          
            
           }

       }
        return newArray;
    }
}
