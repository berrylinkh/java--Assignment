
	public class FirstTriangleForFour{
	public static void main(String[] args) {
	
	for(int star = 1; star <=10; star++) {
		for (int space = 10; space >=star; space--) {
				System.out.print(" ");
			}
		for(int asterisk =1; asterisk <= star; asterisk++){
			System.out.print("*");
				}
			System.out.println();
		}
	}
}