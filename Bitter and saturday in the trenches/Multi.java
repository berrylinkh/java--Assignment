import java.util.Scanner; 
 
  public class Math{
   public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.print ("user input radius");
     int radius = input.nextInt();
     int circleDiameter = radius * radius;
      int circumference = 2 * 3.14159 * radius;
       int area = 3.14159 * radius * radius;
	System.out.printf(" radius is %f%n", radius);
    
}
 }
