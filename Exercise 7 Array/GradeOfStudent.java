
    import java.util.Scanner;
    public class GradeOfStudent {
    public static void main (String[] args) {
    Scanner scanned = new Scanner (System.in);


        System.out.print("Enter the total number of of student grades to be inputted: ");
        int totalNumberOfGrade = scanned.nextInt();
        final int ARRAY_LENGTH = totalNumberOfGrade;
        int[] arrayGrade = new int [ARRAY_LENGTH];

            String scoreGrade;
            String gradeA ="A";
            String gradeB ="B";
            String gradeC ="C";
            String gradeD = "D";
            String gradeF ="F";
            
            String comment;
            String commentOne ="Best 10";
            String commentTwo ="Best 20";
            String commentThree ="Best 30";
            String commentFour ="Best 40";
            String commentFive ="Otherwise";
            

            int score =100;


            
                for(int count =0; count < arrayGrade.length; count++) {
                System.out.print("Enter the number of of student score: ");
                int scoreOfStudent = scanned.nextInt();
                arrayGrade[count] = scoreOfStudent; 

            }   
                System.out.printf("%5s%8s%11s%14s%n", "Student", "Score", "Grade", "Comment");    
        
                for(int counter =0; counter < arrayGrade.length; counter++) {

                if  (score >= 70 && score <= 100) {
                 System.out.print(gradeA +" " +commentOne );
                } 
                /*else if (score > 59 && score <= 69) {
                      scoreGrade = gradeB;
                      comment = commentTwo;
                }

                       scoreGrade == gradeC;
                       comment == commentThree;
                }
                else if (score > 39 && score < 50) {
                       scoreGrade == gradeD;
                       comment == commentFour;
                }                else if (score > 49 && score < 60) {
                else if (score > 39 && score < 50){
                        scoreGrade == gradeF;
                        comment == commentFive;
                }   */

                System.out.printf("%5d%8d%11s%16s%n", counter, arrayGrade[counter], scoreGrade,comment);
            }
                
        }
    }
