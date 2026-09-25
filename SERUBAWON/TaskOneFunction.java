

public class TaskOneFunction{
    public static void main (String [] args) {
    

    int[] primeNumber ={5,9,3,6,2}; 
    
    int primeResult = isPrime(primeNumber);

            System.out.println( primeResult + " ");


    }

    public static int isPrime (int[] theprimeNumber) {
    int thePrime =0;
    int counter =0;
    int numberIncount =0;

        for (int count =0; count < theprimeNumber.length; count ++) {
        numberIncount = theprimeNumber[count];
 
        counter =0;
        for (int checker =1; checker <= numberIncount; checker ++) {
            if ( numberIncount % checker == 0) {
                counter ++;
                }
            }

                for (int index =0; index < theprimeNumber.length; index++ ) {
                 if (counter == 2) {
                index = theprimeNumber[count];
            }
                 return theprimeNumber[count];
    }
}
