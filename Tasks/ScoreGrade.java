





public class ScoreGrade {
    public static void main (String [] args) {

     calculatingTheAverageScoreGrade (80, 55, 60);
    
    }

    public static void calculatingTheAverageScoreGrade (int scoreOne, int scoreTwo, int scoreThree) {
    double averageResult =  (scoreOne + scoreTwo + scoreThree) / 3 ;

        if (averageResult >=90 && averageResult <=100) {
            System.out.println("Letter Grade A");
        }

        else if (averageResult >=80 && averageResult < 90) {
            System.out.println("Letter Grade B");
        }
        else if (averageResult >=70 && averageResult < 80) {
            System.out.println("Letter Grade C"); 
        }
        else if (averageResult >= 60 && averageResult < 70) {
            System.out.println("Letter Grade D");
        }
        
        else if (averageResult >=0  && averageResult <60) {
            System.out.println("Letter Grade F");
        
       }
    }
}





