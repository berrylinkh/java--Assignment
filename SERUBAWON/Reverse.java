
    import java.util.Scanner;
    public class Reverse {
    public static void main (String []args) {

        int number = 1234;

        int digit1= number % 10;

        int digit2= number / 10 % 10;
        
        int digit3= number /100 % 10;

        int digit4= number /1000 % 10;
        
    /*Scanner input = new Scanner(System.in);
        
         System.out.print("Enter number: ");
         int number = input.nextInt();

         int reverse = 0;
         int lastdigit= 0;
    
 
            while (number > 0){
                lastdigit = number %10;
                reverse = (reverse *10) + lastdigit;
                number /=10;

        }*/

        System.out.printf("%d%d%d%d%n", digit1, digit2, digit3, digit4);
    }
}

