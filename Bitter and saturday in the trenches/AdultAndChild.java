import java.util.Scanner;
	
	public class AdultAndChild{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
		

	System.out.print("Name: ");
	String name = input.nextLine();

	System.out.print("Age: ");
	int age =input.nextInt();

		
	if(age < 18){
	System.out.printf("%s is a child", name);
}
	else 
		if(age >= 18) {
	System.out.printf("%s is an adult",name );
}
		}
}