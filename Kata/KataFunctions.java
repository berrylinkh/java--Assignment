

    import java.util.Scanner;
    public class KataFunctions {
    public static void main (String ... args) {
    Scanner scanned = new Scanner(System.in);
    
        System.out.print("Enter number: ");
        int even= scanned.nextInt();
        boolean evenResult = isEven(even);

        System.out.print("Enter integer for prime : ");
        int prime = scanned.nextInt();
        boolean primeResult = isPrime(prime);

        System.out.print("Enter integer one : ");
        int numberOne = scanned.nextInt();

        System.out.print("Enter integer two: ");
        int numberTwo = scanned.nextInt();
        int subtractionResult = subtract(numberOne, numberTwo);

        System.out.print("Enter integer one : ");
        int firstNumber = scanned.nextInt();
        System.out.print("Enter integer two: ");
        int secondNumber = scanned.nextInt();
        float divisionResult = divide(firstNumber, secondNumber);

        System.out.print("Enter integer for factor: ");
        int forFactor = scanned.nextInt();       
        int checkerResult = factor(forFactor);

        System.out.print("Enter integer for square: ");
        int square = scanned.nextInt();       
        boolean squareResult = isSquare(square);

        System.out.print("Enter five digit: ");
        int digit = scanned.nextInt();       
        boolean digitResult = isPalindrome(digit);

        System.out.print("Enter number for factorial: ");
        int forFactorial = scanned.nextInt();       
        long isFactorialResult = factorial(forFactorial);
    
        System.out.print("Enter integer for square: ");
        int number = scanned.nextInt();       
        long squareRootResult = integerSquare(number);

            System.out.println("Even: " +evenResult);
            System.out.println("Prime: " +primeResult);
            System.out.println("subtract: " +subtractionResult);
            System.out.println("division: " +divisionResult);
            System.out.println("Factor: " +checkerResult);
            System.out.println("Square: " +squareResult);
            System.out.println("Palindrome: " +digitResult);
            System.out.println("factorial: " +isFactorialResult);
            System.out.println("Square: " +squareRootResult);
 
    }

    public static boolean isEven (int input) {
        if (input % 2 ==0) {
        return true;    
        } else {
         return false;            
            }
    }

    public static boolean isPrime (int input) {
        if (input % 2 !=0 && input % input ==0) {
        return true;    
        } else {
         return false;            
            }
    }
     public static int subtract (int a, int b) {
        int subtraction = a-b;
        return -subtraction;    
    }
       public static float divide (int a, int b) {
        if (b == 0){
            return 0.0f;
        }
            return (float) a/b; 
            
    }

    public static int factor(int number) {
        int factorCount = 0;

        for(int checker =1; checker <= number; checker++) {
        if (number % checker == 0) {
        factorCount ++;        
            }
        }
        return factorCount;    
    }
      public static boolean isSquare (int number) {
        if(number < 0) {
            return false;
        }

        int squareRoot = (int) Math.sqrt (number);
        if (squareRoot*squareRoot == number) {
        return true;    
        } else {
         return false;            
            }
    }
    public static boolean isPalindrome (int digit) {
        if (digit < 0 &&  digit > 99999) {
         return false;
        }
        int firstDigit = (digit / 10000) % 10;
        int secondDigit = (digit / 1000) % 10;
        int thirdDigit = (digit / 100) % 10;
        int forthDigit = (digit / 10) % 10;
        int fifthDigit = digit % 10 ;

            if (firstDigit == fifthDigit && secondDigit == forthDigit) {
        return true;    
        } else {
         return false;            
            }
    }
    public static long factorial (long number) {
        if (number < 0) {
        return number;
}
        long isFactorial = 1;
        for (long count= 1; count <= number; count ++) {
        isFactorial *= count;
        }
            return isFactorial;
    }
    public static long integerSquare (int number) {
        if(number < 0) {
            return number;
        }
        long squareRoot = number * number;
        return squareRoot;    
    }
}

