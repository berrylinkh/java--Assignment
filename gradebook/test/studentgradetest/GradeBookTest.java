package studentgradetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentgrade.GradeBook;
import studentgrade.Result;
import studentgrade.Student;
import studentgrade.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GradeBookTest {
    private GradeBook gradeBook;
    private Subject subject;
    private Result result;

    @BeforeEach
    public void createGradeBook(){
        Student student = new Student("Aderonke",11);
        Subject subject = new Subject("English",1);
        result = new Result(student,subject,100);
        gradeBook = new GradeBook();
    }
    @Test
    public void testThatGradeBook_isCreated(){
        assertTrue(gradeBook.isCreated());
    }

    @Test
    public void testThatResultCanBeAdded(){
        gradeBook.addResult(result);
        assertEquals(1,gradeBook.getResults().size());
    }
    @Test
    public void testThatMultipleResultCanBeAdded(){
        gradeBook.addResult(result);
        Student secondStudent = new Student("Luke",12);
        Result secondResult = new Result(secondStudent, subject, 100);
        gradeBook.addResult(secondResult);
        assertEquals(2,gradeBook.getResults().size());
    }
    @Test
    public void testThatTotalResultCanBeCalculated(){
        gradeBook.addResult(result);
        Student secondStudent = new Student("Luke",12);
        Result secondResult = new Result(secondStudent, subject, 100);
        gradeBook.addResult(secondResult);
        assertEquals(2,gradeBook.getResults().size());
        assertEquals(200, gradeBook.totalScore());
    }
    @Test
    public void testThatAverageIsCanBeCalculated(){
        gradeBook.addResult(result);
        Student secondStudent = new Student("Luke",12);
        Result secondResult = new Result(secondStudent, subject, 100);
        gradeBook.addResult(secondResult);
        assertEquals(2,gradeBook.getResults().size());
        assertEquals(200, gradeBook.totalScore());
        assertEquals(100, gradeBook.getAverageScore());
    }
    @Test
    public void testThatGetTheHighestScore(){
        gradeBook.addResult(result);
        Student secondStudent = new Student("Luke",12);
        Result secondResult = new Result(secondStudent, subject, 80);
        gradeBook.addResult(secondResult);
        assertEquals(2,gradeBook.getResults().size());
        assertEquals(180, gradeBook.totalScore());
        assertEquals(90, gradeBook.getAverageScore());
        assertEquals(100, gradeBook.getHighestScore());
    }
    @Test
    public void testThatGetTheLowestScore(){
        gradeBook.addResult(result);
        Student secondStudent = new Student("Luke",12);
        Result secondResult = new Result(secondStudent, subject, 80);
        gradeBook.addResult(secondResult);
        assertEquals(2,gradeBook.getResults().size());
        assertEquals(180, gradeBook.totalScore());
        assertEquals(90, gradeBook.getAverageScore());
        assertEquals(80, gradeBook.getLowestScore());
    }
    @Test
    public void testThatGetPassOrFail(){
        gradeBook.addResult(result);
        Student secondStudent = new Student("Luke",12);
        Result secondResult = new Result(secondStudent, subject, 70);
        gradeBook.addResult(secondResult);
        assertEquals(2,gradeBook.getResults().size());
        assertEquals(170, gradeBook.totalScore());
        assertEquals(85, gradeBook.getAverageScore());
        assertEquals(70, gradeBook.getLowestScore());
        assertEquals("Pass", gradeBook.getResultStatus());
    }
}
