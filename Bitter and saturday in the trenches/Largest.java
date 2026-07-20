import java.util.Scanner;          
    public class Largest{
         public static void main(String[]args){  
	  Scanner input = new Scanner(System.in);

		System.out.print("Enter number1: ");
		int number1 = input.nextInt();
		System.out.print("Enter number2: ");
		int number2 = input.nextInt();
		System.out.print("Enter number3: ");
		int number3 = input.nextInt();
		System.out.print("Enter number4: ");
		int number4 = input.nextInt();
		System.out.print("Enter number5: ");
		int number5 = input.nextInt();


if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){ 
System.out.println("first number is the largest: + number1");
}

if(number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5){
System.out.println("first number is the smallest: + number1");
}


if(number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5){
System.out.println("second number is the largest: + number2");
}
if(number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5){
System.out.println("second number is the smallest: + number2");
}


if(number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5){
System.out.println("third number is the largest: + number3"); 
}
if(number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5){
System.out.println("third number is the smallest: + number3");
}



if(number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5){
System.out.println("forth number is the largest: + number4"); 
}
if(number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5){
System.out.println("forth number is the smallest: + number4");

 
}
 if(number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4){
System.out.println("fifth number is the smallest: + number5"); 
}
if(number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4){
System.out.println("fifth number is the largest: + number5"); 
}

}
   }








	
