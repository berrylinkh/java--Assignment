/* PSUEDOCODE
1. CREATE A CLASS FILE
2. CREATE A MAIN METHOD
3. DECLARE A vARIABLE FOR THE COUNTER 
4. USE FOR LOOP  FOR THE COUNTER TO RUN
5. PRINT OUT RESULT
 END */ 

public class PrimeNumbers{
public static void main (String [] args) {

	

		for(int reader = 2; reader <=1000; reader++) {
				int counter = 0;
		for(counter = 2;  counter <=reader / 2 ;  counter ++){
		if (reader % counter ==0){
			break;
				}
			}
		if(counter > reader / 2 &&  ) {
		System.out.println("prime number: " + reader);
			}
				
		}
	}
}


