package studentgrade;

public class Student {
    private String studentName;
    private int studentNumber;

    public Student(String name, int number){
        this.studentName = name;
        this.studentNumber= number;
    }
    public void setStudentNumber(int number) {
        this.studentNumber = number;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentName(String name) {
        this.studentName = name;
    }
//    public double calculateTotalScore(int[] scores) {
//        int sum=0;
//        for (int index =0; index < scores.length; index++ ){
//            sum += scores[index];
//        }
//        return sum;
//    }
}
