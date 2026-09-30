package studentgradetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentgrade.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void createStudentObject(){
        student = new Student("Aderonke",11);
    }
    @Test
    public void testThatSetStudentName(){
        student.setStudentName("Aderonke");
        assertEquals("Aderonke", student.getStudentName());
    }
    @Test
    public void testThatSetStudentNumber(){
        student.setStudentNumber(11);
        assertEquals(11, student.getStudentNumber());
    }
//    @Test
//    public void testThatCalculateTotalSCore(){
//        student.calculateTotalScore();
//        assertEquals(0, student.calculateTotalScore());
//    }

}
