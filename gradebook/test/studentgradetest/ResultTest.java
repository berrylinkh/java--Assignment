package studentgradetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentgrade.Result;
import studentgrade.Student;
import studentgrade.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {
    private Result result;

    @BeforeEach
    public void createSubject(){
        Student student = new Student("Aderonke", 11);
        Subject subject = new Subject("English", 1);
        result = new Result(student,subject,100);
    }
    @Test
    public void testThatGetStudent(){
        assertEquals("Aderonke", result.getStudent().getStudentName());
        assertEquals(11, result.getStudent().getStudentNumber());
    }
    @Test
    public void testThatSetSuject(){
        assertEquals("English", result.getSubject().getSubjectName());
        assertEquals(1, result.getSubject().getSubjectNumber());
    }
    @Test
    public void testThatSetScore(){
        result.setScore(100);
        assertEquals(100, result.getScore());
    }
}
