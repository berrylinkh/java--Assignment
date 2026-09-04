

import java.security. SecureRandom;
    public class RollDice {
        public static void main (String [] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int[] arrayRandomNumbers = new int [7];

        for(int count =1; count < 60_000_000; count++) {
            arrayRandomNumbers[1+ randomNumbers.nextInt(6)]++;
        }
            System.out.printf ("%s%10s%n", "Face"," arrayRandomNumbers");

             for(int face =1; face <  arrayRandomNumbers.length; face++) {
            System.out.printf ("%4d%10d%n", face, arrayRandomNumbers[face]);
            }
        }
    } 
