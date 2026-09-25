


    public class ExerciseSeven{
//    public static int[] reverseTheNumberInTheArray (int[] number) {
//    int[] arrayNumber = new int [10];
//    int  firstNumber = 0;
//
//
//   
//    for (int checker = number.length-1; checker >= 0; checker--) {
//        arrayNumber[firstNumber]= number[checker];
//
//        firstNumber++;
//            }
//        
//    return arrayNumber;
//
//    }
/*
    public static int[] gettingCountTheOccuranceNumber (int[] number) {
    int firstNumber = 0;
    int secondNumber = 0;
    int thirdNumber = 0;
    int forthNumber = 0;
//    int counter = 0;

   
    for (int checker =0; checker <number.length-1; checker++) {
        for (int index = 0; index < check; index++) {
        if (numbers[checker] == number[index]) {
           firstNumber++;
            secoundNumber = secondNUmber + firstNumber
            arrayNumber =number[secoundNumber]
            }
        else {
            secondNumber++;
        }
        if (numbers.length == number[secondNumber]) {
           secondNumber++;
            }
        else {
            thirdNumber++;
            }
        if (numbers.length == number[thirdNumber]) {
           thirdNumber++;
            }
        else {
            forthNumber++;
        }
    }
        
    return firstNumber,secondNumber, thirdNumber,forthNumber;
    }*/

 /*   public static boolean ComparisiumResultOfArray (int[] arraynumberOne,int[] arraynumberTwo) {
    int[] arrayNumber = new int [arraynumberOne.length];
    int[] arraynumberNumbers = new int [arraynumberTwo.length];
        if (arrayNumber.length == arraynumberNumbers.length){
            return true;
        }
        else {
        return false;
        }
    }
    
    public static boolean comparingTheElementArrays (int[] arraynumberOne,int[] arraynumberTwo) {
    int[] arrayNumber = new int [arraynumberOne.length];
    int[] arraynumberNumbers = new int [arraynumberTwo.length];
    int checker = 1;

    for (; checker < arrayNumber.length-1;checker++){}
        if (arrayNumber[checker] ==  arraynumberNumbers.length) {
            return false;
    }
        else{
           return true;
            }
    }

    public static boolean checkingIsConcecutiveFourInTheArrays (int[] arraynumberOne) {*/
    public static void main (String []args) {
    //int[] arrayNumber = new int [arraynumberOne.length];
    int[] arrayNumber = {3 ,4 ,5 ,5 ,5 ,5 ,4 ,5};
    int counterHolder =0;
    int totalCount = 4;
    int total =0;

        for (int number =0; number < arrayNumber.length;number++) {
//            counterHolder = 0;
            for(int count =1; count < arrayNumber[number]; count++) {
             if (number % count == 0) {
                counterHolder ++;
                    }
                }
         if (counterHolder == 4) {
//              total = counterHolder;
//                }
//        
//            }
      //if (total == totalCount) {
        System.out.println( total);
       }
 }         /*return  true;
        }   
        else {
            return false;
        }*/
    }
}

