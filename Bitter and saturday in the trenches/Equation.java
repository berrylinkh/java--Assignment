 import java.util.Scanner;
	public class Equation{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	double a = 3.4;
	double b = 50.2;
	double c = 2.1;
	double d = 0.55;
	double e = 44.5;
	double f = 5.9;

	double x = (e * d) - (b * f) / (a* d) - (b*c);
	double y = (a * f) - (e * c) / (a * d) - (b * c);

	System.out.printf("x = %.2f%n ", x);
	System.out.printf("y = %.2f%n ", y);
 }
}

