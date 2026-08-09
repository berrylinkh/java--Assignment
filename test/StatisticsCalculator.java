public class StatisticsCalculator{

	public static int calculateRangeOf(int[] numbers){
	
		return findLargestNumberIn(numbers) - findSmallestNumberIn(numbers);

	}

    public static int calculateAverageOf(int[] numbers){
	
		return findMeanAverageIn(numbers);

	}

    public static int calculateMedianOf(int[] numbers){
	
		return findMedianIn(numbers);

	}



	private static int findLargestNumberIn(int[] numbers){
		int largest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > largest)
				largest = numbers[index];
		}
		return largest;
	}

	private static int findSmallestNumberIn(int[] numbers){
		int smallest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] < smallest)
				smallest = numbers[index];
		}
		return smallest;
	}

    private static int findMeanAverageIn(int[] numbers){
        int sum = 0;	
        int totalNumber = numbers.length;	
        int average =0;
		for(int count = 0; count < numbers.length; count++){
			sum += numbers[count];
		}
        average = sum / totalNumber;
        
		return average;
	}

    private static int findMedianIn(int[] numbers){

        
    int arrayOfNumber = 0;
    int median = 0;

    for(int num = 0; num < numbers.length; num++) {
        for(int index = 0; index < numbers.length; index++) {
                if (numbers[num] > numbers[index]) {
                    arrayOfNumber = numbers[num];
                    numbers[num] = numbers[index];
                    numbers[index] = arrayOfNumber;
                    median = numbers[(7 + 1) / 2 - 1];
                    
                    }
                  }
            }
   
            return median;  
    }      

}
