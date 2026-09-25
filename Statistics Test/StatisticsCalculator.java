public class StatisticsCalculator{




	public static int calculateRangeOf(int[] numbers){
	
		return findLargestNumberIn(numbers) - findSmallestNumberIn(numbers);

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



}