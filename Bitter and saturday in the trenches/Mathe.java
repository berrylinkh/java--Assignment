import java.util.Scanner; 

  public class Mathe{
   public static void main(String[]args){
   Scanner input = new Scanner(System.in);
    System.out.print ("user input radius");
     double radius = input.nextDouble();

	final double PI = (int)(3.14159);
     double Diameter = 2 * radius;
     double circumference = ((2 * PI) * radius);
     double area = 3.14159 * (radius * radius);

	System.out.printf("diameter = %f%n ", Diameter );
	System.out.printf("The circumference of the circle is %f%n", circumference);
	System.out.printf("The area of the circle is %f%n", area);
    
}
 }
