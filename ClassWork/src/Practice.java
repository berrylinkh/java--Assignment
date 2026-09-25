public class Practice {

    public static int[] getSquare(int[] numbers) {

        int [] result = new int[numbers.length];

        int [] sorted = new int [numbers.length];

        int sortedCount = 0;

        int resultCount = 0;

        for (int count = 0; count < numbers.length; count++) {

            if (numbers[count] < 0 || numbers[count] > 1000 ){
                throw new IllegalArgumentException("You entered an invalid number");
            }
            result[resultCount] = numbers[count] * numbers[count];

            resultCount++;
        }

        for (int count = 0; count < result.length; count++) {
            for (int index = 0; index < result.length; index++) {
                if (result[index] < result[count]){
                    int temp = result[index];
                    result[index] = result[count];
                    result[count] = temp;
                    sorted[sortedCount] = result[index];
                }

            }

        }


        return result;
    }
}
