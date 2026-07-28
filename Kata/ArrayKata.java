

    import java.util.Scanner;
    import java.util.Arrays;
    public class ArrayKata {
    public static void main (String ... args) {
    Scanner scanned = new Scanner(System.in);
    
   
            int[]numberOfArray = new int[10];
            //int[]maxResult = numberOfArray;

            for (int count = 0; count < numberOfArray.length; count++ ) {
                  System.out.print("Enter numbers: ");
                  numberOfArray [count] = scanned.nextInt();       
        }

       

            System.out.println("Maximum: " +maximumIn(numberOfArray));
            System.out.println("Minimum: " +minimumIn(numberOfArray));
            System.out.println("Sum: " +isSum(numberOfArray));
            System.out.println("SumOf Even NUmbers: "+isEven(numberOfArray));
            System.out.println("SumOf Odd NUmbers: "+isOdd(numberOfArray));
            System.out.println("Maximun and Minimun: " +Arrays.toString(maximumInMIninum(numberOfArray)));
            System.out.println("Count Of Odd NUmbers: "+Odd(numberOfArray));
            System.out.println("Count Of Even NUmbers: "+Even(numberOfArray));
            System.out.println("Return Of Even NUmbers: " +Arrays.toString(returnEven(numberOfArray)));
            System.out.println("Return Of Odd NUmbers: " +Arrays.toString(returnOdd(numberOfArray))); 
            System.out.println("Square: " +Arrays.toString(square(numberOfArray)));
 
    }

    public static int maximumIn(int [] numberOfArray){
    int max = numberOfArray[0]; 
    for (int num : numberOfArray) {
        if (num > max) {
            max = num;
        }

    }
        return max;


}

    public static int minimumIn(int [] numberOfArray){
    int min = 0; 
    for (int num : numberOfArray) {
        if (num <= min) {
            min = num;
        }

    }
        return min;
}

    
    public static int isSum(int [] numberOfArray){
    int sum = 0; 
    for (int num : numberOfArray) {
            sum += num;
        }
        return sum;
}
          
    public static int isEven(int [] numberOfArray){
    int sum = 0;
    for (int num : numberOfArray) {
            if (num % 2 ==0) {
            sum += num;
            }
        }
        return sum;
}

    public static int isOdd(int [] numberOfArray){
    int sum = 0;
    for (int num : numberOfArray) {
            if (num % 2 !=0) {
            sum += num;
            }
        }
        return sum;
}
    public static int[] maximumInMIninum(int [] numberOfArray){
    int max = 0; 
    int min = 0; 
    for (int num : numberOfArray) {
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }

    }   
        return new int[] {max,min};


}

    public static int Odd(int [] numberOfArray){
    int count = 0;
    for (int num : numberOfArray) {
            if (num % 2 !=0) {
            count ++;
            }
        }
        return count;
}
    
    public static int Even(int [] numberOfArray){
    int count = 0;
    for (int num : numberOfArray) {
            if (num % 2 ==0) {
            count ++;
            }
        }
        return count;
}
    
     public static int[] returnEven (int [] numberOfArray){
    int count= 0;
    for (int num : numberOfArray) {
        if (num % 2 ==0) {
            count++;
        }
    }
    int index = 0;    
    int [] evenNumber = new int [count];
    for (int num : numberOfArray) {
            if (num % 2 ==0) {
            evenNumber[index]=num;
            index ++;
            }
        }
        return evenNumber;
}
     
     public static int[] returnOdd (int [] numberOfArray){
    int count= 0;
    for (int num : numberOfArray) {
        if (num % 2 !=0) {
            count++;
        }
    }
    int index = 0;    
    int [] oddNumber = new int [count];
    for (int num : numberOfArray) {
            if (num % 2 !=0) {
            oddNumber[index]=num;
            index ++;
            }
        }
        return oddNumber;
}      
    
    public static int[] square (int [] numberOfArray){
    int index = 0;    
    int [] squareNumber = new int [numberOfArray.length];
    for (int num : numberOfArray) {
            squareNumber[index]= num * num;
            index ++;
            }
        return squareNumber;
    }  
}

