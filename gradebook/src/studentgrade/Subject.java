package studentgrade;

public class Subject {
    private String subjectName;
    private int subjectNumber;

    public Subject(String subjectName, int subjectNumber ){
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public int getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectNumber(int subjectNumber) {
        this.subjectNumber = subjectNumber;
    }
}
