package studentgrade;

public class Result {
    private Student student;
    private Subject subject;
    private int score;

    public Result(Student student, Subject subject, int score){
        this.student = student;
        this.subject = subject;
        this.score =score;
    }

    public Student getStudent() {
        return student;
    }
    public Subject getSubject() {
        return subject;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
