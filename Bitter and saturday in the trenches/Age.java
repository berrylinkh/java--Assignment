// calculating of total and average score of three users

	import java.util.Scanner;
	public class Age{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter score1: ");
	int score1 = input.nextInt();
	System.out.print("Enter score2: ");
	int score2 = input.nextInt();
	System.out.print("Enter score3: ");
	int score3 = input.nextInt();

	int total = score1 + score2 + score3;
	int average = sum / 2;

	System.out.printf("total of scores %d%n ", total);
	System.out.printf("average of score %d ", average);

} //main method close.
} // class ends.