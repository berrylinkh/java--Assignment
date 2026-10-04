package studentgrade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentgrade.GradeBook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GradeBookTest {
    private GradeBook gradeBook;

    private Subject subject;
    private Subject secondSubject;
    private Subject thirdSubject;
    private Subject forthSubject;

    private Result result;
    private Result secondResult;
    private Result thirdResult;
    private Result forthResult;


    private Student student;
    private Student secondStudent;
    private Student thirdStudent;
    private Student forthStudent;

    @BeforeEach
    public void createGradeBook() {
        student = new Student("Aderonke", 11);
        subject = new Subject("English", 1);
        result = new Result(student, subject, 100);
        gradeBook = new GradeBook();
    }

    @Test
    public void testThatGradeBook_isCreated() {
        assertTrue(gradeBook.isCreated());
    }

    @Test
    public void testThatResultCanBeAdded() {
        gradeBook.addResult(result);
        assertEquals(1, gradeBook.getResults().size());
    }

    @Test
    public void testThatMultipleResultCanBeAdded() {

        student = new Student("Aderonke", 11);
        result = new Result(student, subject, 100);
        secondResult = new Result(student, secondSubject, 80);
        thirdResult = new Result(student, thirdSubject, 76);
        forthResult = new Result(student, forthSubject, 81);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);

        assertEquals(4, gradeBook.getResults().size());


        secondStudent = new Student("Luke", 12);

        result = new Result(secondStudent, subject, 40);
        secondResult = new Result(secondStudent, secondSubject, 60);
        thirdResult = new Result(secondStudent, thirdSubject, 37);
        forthResult = new Result(secondStudent, forthSubject, 70);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);

        assertEquals(8, gradeBook.getResults().size());


        thirdStudent = new Student("John", 13);

        result = new Result(thirdStudent, subject, 50);
        secondResult = new Result(thirdStudent, secondSubject, 70);
        thirdResult = new Result(thirdStudent, thirdSubject, 63);
        forthResult = new Result(thirdStudent, forthSubject, 76);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);

        assertEquals(12, gradeBook.getResults().size());


        forthStudent = new Student("Lola", 14);

        result = new Result(forthStudent, subject, 67);
        secondResult = new Result(forthStudent, secondSubject, 92);
        thirdResult = new Result(forthStudent, thirdSubject, 83);
        forthResult = new Result(forthStudent, forthSubject, 94);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);

        assertEquals(16, gradeBook.getResults().size());
    }

    @Test
    public void testThatTotalResultCanBeCalculated() {

        student = new Student("Aderonke", 11);
        result = new Result(student, subject, 100);
        secondResult = new Result(student, secondSubject, 80);
        thirdResult = new Result(student, thirdSubject, 76);
        forthResult = new Result(student, forthSubject, 81);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(4, gradeBook.getResults().size());
        assertEquals(337, gradeBook.totalScore(student));


        secondStudent = new Student("Luke", 12);

        result = new Result(secondStudent, subject, 40);
        secondResult = new Result(secondStudent, secondSubject, 60);
        thirdResult = new Result(secondStudent, thirdSubject, 37);
        forthResult = new Result(secondStudent, forthSubject, 70);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(8, gradeBook.getResults().size());
        assertEquals(207, gradeBook.totalScore(secondStudent));


        thirdStudent = new Student("John", 13);
        result = new Result(thirdStudent, subject, 50);
        secondResult = new Result(thirdStudent, secondSubject, 70);
        thirdResult = new Result(thirdStudent, thirdSubject, 63);
        forthResult = new Result(thirdStudent, forthSubject, 76);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(12, gradeBook.getResults().size());
        assertEquals(259, gradeBook.totalScore(thirdStudent));


        forthStudent = new Student("Lola", 14);
        result = new Result(forthStudent, subject, 67);
        secondResult = new Result(forthStudent, secondSubject, 92);
        thirdResult = new Result(forthStudent, thirdSubject, 83);
        forthResult = new Result(forthStudent, forthSubject, 94);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(16, gradeBook.getResults().size());
        assertEquals(336, gradeBook.totalScore(forthStudent));
    }

    @Test
    public void testThatAverageIsCanBeCalculated() {

        student = new Student("Aderonke", 11);
        result = new Result(student, subject, 100);
        secondResult = new Result(student, secondSubject, 80);
        thirdResult = new Result(student, thirdSubject, 76);
        forthResult = new Result(student, forthSubject, 81);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(4, gradeBook.getResults().size());
        assertEquals(337, gradeBook.totalScore(student));
        assertEquals(84.3, gradeBook.getAverageScore(student));


        secondStudent = new Student("Luke", 12);

        result = new Result(secondStudent, subject, 40);
        secondResult = new Result(secondStudent, secondSubject, 60);
        thirdResult = new Result(secondStudent, thirdSubject, 37);
        forthResult = new Result(secondStudent, forthSubject, 70);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(8, gradeBook.getResults().size());
        assertEquals(207, gradeBook.totalScore(secondStudent));
        assertEquals(51.8, gradeBook.getAverageScore(secondStudent));


        thirdStudent = new Student("John", 13);
        result = new Result(thirdStudent, subject, 50);
        secondResult = new Result(thirdStudent, secondSubject, 70);
        thirdResult = new Result(thirdStudent, thirdSubject, 63);
        forthResult = new Result(thirdStudent, forthSubject, 76);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(12, gradeBook.getResults().size());
        assertEquals(259, gradeBook.totalScore(thirdStudent));
        assertEquals(64.8, gradeBook.getAverageScore(thirdStudent));


        forthStudent = new Student("Lola", 14);
        result = new Result(forthStudent, subject, 67);
        secondResult = new Result(forthStudent, secondSubject, 92);
        thirdResult = new Result(forthStudent, thirdSubject, 83);
        forthResult = new Result(forthStudent, forthSubject, 94);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(16, gradeBook.getResults().size());
        assertEquals(336, gradeBook.totalScore(forthStudent));
        assertEquals(84.0, gradeBook.getAverageScore(forthStudent));
}

    @Test
    public void testThatGetTheHighestScore() {
        student = new Student("Aderonke", 11);
        result = new Result(student, subject, 100);
        secondResult = new Result(student, secondSubject, 80);
        thirdResult = new Result(student, thirdSubject, 76);
        forthResult = new Result(student, forthSubject, 81);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(4, gradeBook.getResults().size());
        assertEquals(337, gradeBook.totalScore(student));
        assertEquals(84.3, gradeBook.getAverageScore(student));

        secondStudent = new Student("Luke", 12);
        result = new Result(secondStudent, subject, 40);
        secondResult = new Result(secondStudent, secondSubject, 60);
        thirdResult = new Result(secondStudent, thirdSubject, 37);
        forthResult = new Result(secondStudent, forthSubject, 70);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(8, gradeBook.getResults().size());
        assertEquals(207, gradeBook.totalScore(secondStudent));
        assertEquals(51.8, gradeBook.getAverageScore(secondStudent));

        thirdStudent = new Student("John", 13);
        result = new Result(thirdStudent, subject, 50);
        secondResult = new Result(thirdStudent, secondSubject, 70);
        thirdResult = new Result(thirdStudent, thirdSubject, 63);
        forthResult = new Result(thirdStudent, forthSubject, 76);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(12, gradeBook.getResults().size());
        assertEquals(259, gradeBook.totalScore(thirdStudent));
        assertEquals(64.8, gradeBook.getAverageScore(thirdStudent));

        forthStudent = new Student("Lola", 14);
        result = new Result(forthStudent, subject, 67);
        secondResult = new Result(forthStudent, secondSubject, 92);
        thirdResult = new Result(forthStudent, thirdSubject, 83);
        forthResult = new Result(forthStudent, forthSubject, 94);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(16, gradeBook.getResults().size());
        assertEquals(336, gradeBook.totalScore(forthStudent));
        assertEquals(84.0, gradeBook.getAverageScore(forthStudent));
        assertEquals(100, gradeBook.getHighestScore());
    }


    @Test
    public void testThatGetTheLowestScore() {
        student = new Student("Aderonke", 11);
        result = new Result(student, subject, 100);
        secondResult = new Result(student, secondSubject, 80);
        thirdResult = new Result(student, thirdSubject, 76);
        forthResult = new Result(student, forthSubject, 81);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(4, gradeBook.getResults().size());
        assertEquals(337, gradeBook.totalScore(student));
        assertEquals(84.3, gradeBook.getAverageScore(student));

        secondStudent = new Student("Luke", 12);
        result = new Result(secondStudent, subject, 40);
        secondResult = new Result(secondStudent, secondSubject, 60);
        thirdResult = new Result(secondStudent, thirdSubject, 37);
        forthResult = new Result(secondStudent, forthSubject, 70);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(8, gradeBook.getResults().size());
        assertEquals(207, gradeBook.totalScore(secondStudent));
        assertEquals(51.8, gradeBook.getAverageScore(secondStudent));

        thirdStudent = new Student("John", 13);
        result = new Result(thirdStudent, subject, 50);
        secondResult = new Result(thirdStudent, secondSubject, 70);
        thirdResult = new Result(thirdStudent, thirdSubject, 63);
        forthResult = new Result(thirdStudent, forthSubject, 76);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(12, gradeBook.getResults().size());
        assertEquals(259, gradeBook.totalScore(thirdStudent));
        assertEquals(64.8, gradeBook.getAverageScore(thirdStudent));

        forthStudent = new Student("Lola", 14);
        result = new Result(forthStudent, subject, 67);
        secondResult = new Result(forthStudent, secondSubject, 92);
        thirdResult = new Result(forthStudent, thirdSubject, 83);
        forthResult = new Result(forthStudent, forthSubject, 94);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(16, gradeBook.getResults().size());
        assertEquals(336, gradeBook.totalScore(forthStudent));
        assertEquals(84.0, gradeBook.getAverageScore(forthStudent));
        assertEquals(37, gradeBook.getLowestScore());
    }

    @Test
    public void testThatGetIfStudentPassesOrFail() {

        student = new Student("Aderonke", 11);
        result = new Result(student, subject, 100);
        secondResult = new Result(student, secondSubject, 80);
        thirdResult = new Result(student, thirdSubject, 76);
        forthResult = new Result(student, forthSubject, 81);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(4, gradeBook.getResults().size());
        assertEquals(337, gradeBook.totalScore(student));
        assertEquals(84.3, gradeBook.getAverageScore(student));
        assertEquals("Pass", gradeBook.getResultStatus(student));

        secondStudent = new Student("Luke", 12);
        result = new Result(secondStudent, subject, 40);
        secondResult = new Result(secondStudent, secondSubject, 60);
        thirdResult = new Result(secondStudent, thirdSubject, 37);
        forthResult = new Result(secondStudent, forthSubject, 70);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(8, gradeBook.getResults().size());
        assertEquals(207, gradeBook.totalScore(secondStudent));
        assertEquals(51.8, gradeBook.getAverageScore(secondStudent));
        assertEquals("Pass", gradeBook.getResultStatus(secondStudent));

        thirdStudent = new Student("John", 13);
        result = new Result(thirdStudent, subject, 50);
        secondResult = new Result(thirdStudent, secondSubject, 70);
        thirdResult = new Result(thirdStudent, thirdSubject, 63);
        forthResult = new Result(thirdStudent, forthSubject, 76);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(12, gradeBook.getResults().size());
        assertEquals(259, gradeBook.totalScore(thirdStudent));
        assertEquals(64.8, gradeBook.getAverageScore(thirdStudent));
        assertEquals("Pass", gradeBook.getResultStatus(thirdStudent));

        forthStudent = new Student("Lola", 14);
        result = new Result(forthStudent, subject, 67);
        secondResult = new Result(forthStudent, secondSubject, 92);
        thirdResult = new Result(forthStudent, thirdSubject, 83);
        forthResult = new Result(forthStudent, forthSubject, 94);

        gradeBook.addResult(result);
        gradeBook.addResult(secondResult);
        gradeBook.addResult(thirdResult);
        gradeBook.addResult(forthResult);
        assertEquals(16, gradeBook.getResults().size());
        assertEquals(336, gradeBook.totalScore(forthStudent));
        assertEquals(84.0, gradeBook.getAverageScore(forthStudent));
        assertEquals(37, gradeBook.getLowestScore());
        assertEquals("Pass", gradeBook.getResultStatus(forthStudent));
        }
        @Test
        public void testThatGetPositionOfStudents(){

            student = new Student("Aderonke", 11);
            result = new Result(student, subject, 100);
            secondResult = new Result(student, secondSubject, 80);
            thirdResult = new Result(student, thirdSubject, 76);
            forthResult = new Result(student, forthSubject, 81);
            gradeBook.addResult(result);
            gradeBook.addResult(secondResult);
            gradeBook.addResult(thirdResult);
            gradeBook.addResult(forthResult);


            secondStudent = new Student("Luke", 12);
            result = new Result(secondStudent, subject, 40);
            secondResult = new Result(secondStudent, secondSubject, 60);
            thirdResult = new Result(secondStudent, thirdSubject, 37);
            forthResult = new Result(secondStudent, forthSubject, 70);
            gradeBook.addResult(result);
            gradeBook.addResult(secondResult);
            gradeBook.addResult(thirdResult);
            gradeBook.addResult(forthResult);

            thirdStudent = new Student("John", 13);
            result = new Result(thirdStudent, subject, 50);
            secondResult = new Result(thirdStudent, secondSubject, 70);
            thirdResult = new Result(thirdStudent, thirdSubject, 63);
            forthResult = new Result(thirdStudent, forthSubject, 76);

            gradeBook.addResult(result);
            gradeBook.addResult(secondResult);
            gradeBook.addResult(thirdResult);
            gradeBook.addResult(forthResult);

            forthStudent = new Student("Lola", 14);
            result = new Result(forthStudent, subject, 67);
            secondResult = new Result(forthStudent, secondSubject, 92);
            thirdResult = new Result(forthStudent, thirdSubject, 83);
            forthResult = new Result(forthStudent, forthSubject, 94);
            gradeBook.addResult(result);
            gradeBook.addResult(secondResult);
            gradeBook.addResult(thirdResult);
            gradeBook.addResult(forthResult);

            assertEquals(16, gradeBook.getResults().size());

            assertEquals(337, gradeBook.totalScore(student));
            assertEquals(84.3, gradeBook.getAverageScore(student));
            assertEquals("Pass", gradeBook.getResultStatus(student));
            assertEquals(1, gradeBook.getStudentPosition(student));


            assertEquals(207, gradeBook.totalScore(secondStudent));
            assertEquals(51.8, gradeBook.getAverageScore(secondStudent));
            assertEquals("Pass", gradeBook.getResultStatus(secondStudent));
            assertEquals(4, gradeBook.getStudentPosition(secondStudent));
    `   `
            assertEquals(259, gradeBook.totalScore(thirdStudent));
            assertEquals(64.8, gradeBook.getAverageScore(thirdStudent));
            assertEquals("Pass", gradeBook.getResultStatus(thirdStudent));
            assertEquals(3, gradeBook.getStudentPosition(thirdStudent));

            assertEquals(336, gradeBook.totalScore(forthStudent));
            assertEquals(84.0, gradeBook.getAverageScore(forthStudent));
            assertEquals(37, gradeBook.getLowestScore());
            assertEquals("Pass", gradeBook.getResultStatus(forthStudent));
            assertEquals(2, gradeBook.getStudentPosition(forthStudent));
        }
    }



