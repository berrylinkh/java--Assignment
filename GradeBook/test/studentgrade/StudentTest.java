package studentgrade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentgrade.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class StudentTest {
        private Student student;
        private Student secondStudent;
        private Student thirdStudent;
        private Student forthStudent;

        @BeforeEach
        public void createStudentObject(){
            student = new Student("Aderonke",11);
            secondStudent = new Student("Luke",12);
            thirdStudent = new Student("John",13);
            forthStudent = new Student("Lola",14);
        }
        @Test
        public void testThatSetStudentNameOfAStudent() {
            student.setStudentName("Aderonke");
            assertEquals("Aderonke", student.getStudentName());
        }
        @Test
        public void testThatSetStudentNameOfMultipleStudents(){
            student.setStudentName("Aderonke");
            assertEquals("Aderonke", student.getStudentName());
            student.setStudentName("Luke");
            assertEquals("Luke", secondStudent.getStudentName());
            student.setStudentName("John");
            assertEquals("John", thirdStudent.getStudentName());
            student.setStudentName("Lola");
            assertEquals("Lola", forthStudent.getStudentName());
        }

        @Test
        public void testThatSetStudentNumber(){
            student.setStudentNumber(11);
            assertEquals(11, student.getStudentNumber());
            secondStudent.setStudentNumber(12);
            assertEquals(12, secondStudent.getStudentNumber());
            secondStudent.setStudentNumber(13);
            assertEquals(13, thirdStudent.getStudentNumber());
            secondStudent.setStudentNumber(14);
            assertEquals(14, forthStudent.getStudentNumber());
        }
    }

