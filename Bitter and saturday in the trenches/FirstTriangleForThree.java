
	public class FirstTriangleForThree{
	public static void main(String[] args) {
	
	
	for(int star = 1; star <=10; star++) {
		for (int space = 1; space <=star; space++) {
				System.out.print(" ");
			}
		for(int asterisk =10; asterisk >= star; asterisk--){
			System.out.print("*");
				}
			System.out.println();
		}
	}
}