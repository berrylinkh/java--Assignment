// Creating a table
	public class Table{
	public static void main(String[]args){
	System.out.println("Number\tSquared\tCubed");

	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int e = 5;
	int square1 =a*a ;
	int cube1 = a*a*a;
	int square2 =b*b ;
	int cube2 = b*b*b;
	int square3 =c*c ;
	int cube3 = c*c*c;
	int square4 =d*d ;
	int cube4 = d*d*d;
	int square5 =e*e ;
	int cube5 = e*e*e;

	

// inputting figures into the columm

	System.out.println(a + "\t" + square1 + "\t" + cube1);
	System.out.println(b + "\t" + square2 + "\t" + cube2);
	System.out.println(c + "\t" + square3 + "\t" + cube3);
	System.out.println(d + "\t" + square4 + "\t" + cube4);
	System.out.println(e + "\t" + square5 + "\t" + cube5);

}
}

psuedocode
1. create a variable for each number
2. create a square and cube variable for each number
3. print using \t for the table.