
public class Calculator{
public static void main (String...args) {

System.out.println(calculate(8,5,'*'));

}


public static double add(int numberOne, int numberTwo){
        double add = numberOne + numberTwo;
    
        return add;  
}

public static double subtract(int numberOne, int numberTwo){
        double subtract = numberOne - numberTwo;
    
        return subtract;  
}

public static double divide(int numberOne, int numberTwo){
        double divide = numberOne / numberTwo;
    
        return divide;
}


public static double multiply(int numberOne, int numberTwo){
        double result = numberOne * numberTwo;
    
        return result;
}
public static double calculate(int numberOne, int numberTwo, char symbol){

	switch(symbol){
				
		case '+':  return add(numberOne, numberTwo);
		case '-':  return subtract(numberOne, numberTwo);
		case '/':  return divide(numberOne, numberTwo); 
		case '*':  return multiply(numberOne, numberTwo);
		default: System.out.println("Invalid input"); 
		}
return 0;
}	



}

