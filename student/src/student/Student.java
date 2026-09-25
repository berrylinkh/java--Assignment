package student;

public class Student {
        private String studentName;
        private int gradeLevel = 0;

        public Student() {
        }

        public String getStudentName() {
            return studentName;
        }

        public int getGradeLevel() {
            return gradeLevel;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setGradeLevel(int gradeLevel) {
            this.gradeLevel = gradeLevel;
        }

        public void updateName(String currentName) {
            this.studentName = currentName;
        }

        public int increaseTheGrade() {
            if (this.gradeLevel >= 1 && this.gradeLevel < 12) {
                int addition = this.gradeLevel + 1;
                gradeLevel = addition;
         }
            else {
              throw new IllegalArgumentException("Invalid grade level");
            }
            return gradeLevel;
        }

        public boolean isGraduating() {
            boolean graduationVaildidation;
            if (this.gradeLevel == 12) {
                graduationVaildidation = true;
            } else {
                graduationVaildidation = false;
            }

            return graduationVaildidation;
        }
    }

