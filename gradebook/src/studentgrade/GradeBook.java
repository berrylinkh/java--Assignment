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
}
