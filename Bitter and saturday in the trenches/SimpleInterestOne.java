import java.util.Scanner;
	public class SimpleInterestOne{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("principal: ");
	double principal = input.nextDouble();

	System.out.print("rate: ");
	double rate = input.nextDouble();
	
	System.out.print("time: ");
	double time = input.nextDouble();

	double simpleInterest = principal * rate * time;
	double totalAmount = principal + simpleInterest;

	
	System.out.printf("Simple Interest: %.2f%n", simpleInterest);
	System.out.printf("Total Amount: %.2f%n", totalAmount);
}
}
	
Psuedocode
1.create three input for principal, rate and time 
2.Calculate the simple interest ( principal * rate * time)
3.Calculate the total amount ( principal + simple interest)
3.Print out the output.
