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

    public int totalScore() {
        int sum =0;
        for(int index =0; index < results.size(); index++){
            sum += results.get(index).getScore();
        }
        return sum;
    }

    public double getAverageScore() {
        double average = (double)totalScore() / results.size();
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

    public String getResultStatus() {
        if(getAverageScore() >= 70 && getAverageScore() <= 100 ){
            return "Pass";
        }else {
            return "Fail";
        }
    }
}
