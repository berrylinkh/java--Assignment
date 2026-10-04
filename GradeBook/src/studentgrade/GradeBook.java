package studentgrade;

import java.util.ArrayList;

    public class GradeBook {
        private ArrayList<Result> results;
        private int score;

        public GradeBook(){
            this.results = new ArrayList<>();
        }

        public ArrayList<Result> getResults() {
            return results;
        }
        public boolean isCreated() {
            return true;
        }

        public void addResult(Result result) {
            results.add(result);
        }

        public int totalScore(Student student) {
            int sum = 0;

            for (int index = 0; index < results.size(); index++) {
                if (results.get(index).getStudent() == student) {
                    sum += results.get(index).getScore();
                }
            }
            return sum;
        }

        public double getAverageScore(Student student) {
            double calculatedAverage = (double)totalScore(student) / 4;
            double average = Math.round(calculatedAverage * 10.0) /10.0;
            return average;
        }

        public int getHighestScore() {
            int highestScore = results.get(0).getScore();
            for (Result result: results ){
                if( result.getScore() > highestScore){
                    highestScore = result.getScore();
                }
            }
            return highestScore;
        }

        public int getLowestScore() {
            int lowestScore = results.get(0).getScore();
            for (Result result: results ){
                if( result.getScore() < lowestScore){
                    lowestScore = result.getScore();
                }
            }
            return lowestScore;
        }

        public String getResultStatus(Student student ) {
            if(getAverageScore(student) >= 50 && getAverageScore(student) <= 100 ){
                return "Pass";
            }else {
                return "Fail";
            }
        }

        public int getStudentPosition(Student student) {
            ArrayList<Integer> checkedStudents = new ArrayList<>();
            int position =1;
            int studentTotal = totalScore(student);
            for (Result result: results ) {
                Student otherStudent = result.getStudent();

                if (!checkedStudents.contains(otherStudent.getStudentNumber())) {
                    if (totalScore(otherStudent) > studentTotal) {
                        position++;
                    }
                    checkedStudents.add(otherStudent.getStudentNumber());
                }
            }
            return position;
        }
    }

