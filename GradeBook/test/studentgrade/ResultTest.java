package studentgrade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {

        private Result result;
        private Result secondResult;
        private Result thirdResult;
        private Result forthResult;

        private Subject subject;
        private Subject secondSubject;
        private Subject thirdSubject;
        private Subject forthSubject;

        private Student student;
        private Student secondStudent;
        private Student thirdStudent;
        private Student forthStudent;

    @BeforeEach
        public void createSubject(){
            student = new Student("Aderonke", 11);
            subject = new Subject("English", 1);
            secondSubject = new Subject("Mathematics", 2);
            thirdSubject = new Subject("Civic Education", 3);
            forthSubject = new Subject("Basic Science", 4);
            result = new Result(student,subject,100);
            secondResult = new Result(student,secondSubject,80);
            thirdResult = new Result(student,thirdSubject,76);
            forthResult = new Result(student,forthSubject,81);

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
            assertEquals("Mathematics",secondResult.getSubject().getSubjectName() );
            assertEquals(2, secondResult.getSubject().getSubjectNumber());
            assertEquals("Civic Education",thirdResult.getSubject().getSubjectName());
            assertEquals(3, thirdResult.getSubject().getSubjectNumber());
            assertEquals("Basic Science",forthResult.getSubject().getSubjectName());
            assertEquals(4, forthResult.getSubject().getSubjectNumber());
        }
        @Test
        public void testThatSetScore(){
            result.setScore(100);
            assertEquals(100, result.getScore());
            secondResult.setScore(80);
            assertEquals(80, secondResult.getScore());
            thirdResult.setScore(76);
            assertEquals(76, thirdResult.getScore());
            forthResult.setScore(81);
            assertEquals(81, forthResult.getScore());
        }
    @Test
    public void testThatSetSujectAndScoreForMultipleStudents(){
        assertEquals("English", result.getSubject().getSubjectName());
        assertEquals(1, result.getSubject().getSubjectNumber());
        result.setScore(100);
        assertEquals(100, result.getScore());
        assertEquals("Mathematics",secondResult.getSubject().getSubjectName() );
        assertEquals(2, secondResult.getSubject().getSubjectNumber());
        secondResult.setScore(80);
        assertEquals(80, secondResult.getScore());
        assertEquals("Civic Education",thirdResult.getSubject().getSubjectName());
        assertEquals(3, thirdResult.getSubject().getSubjectNumber());
        thirdResult.setScore(76);
        assertEquals(76, thirdResult.getScore());
        assertEquals("Basic Science",forthResult.getSubject().getSubjectName());
        assertEquals(4, forthResult.getSubject().getSubjectNumber());
        forthResult.setScore(81);
        assertEquals(81, forthResult.getScore());

        secondStudent = new Student("Luke", 12);
        assertEquals("English", result.getSubject().getSubjectName());
        assertEquals(1, result.getSubject().getSubjectNumber());
        result.setScore(40);
        assertEquals(40, result.getScore());
        assertEquals("Mathematics",secondResult.getSubject().getSubjectName() );
        assertEquals(2, secondResult.getSubject().getSubjectNumber());
        secondResult.setScore(60);
        assertEquals(60, secondResult.getScore());
        assertEquals("Civic Education",thirdResult.getSubject().getSubjectName());
        assertEquals(3, thirdResult.getSubject().getSubjectNumber());
        thirdResult.setScore(37);
        assertEquals(37, thirdResult.getScore());
        assertEquals("Basic Science",forthResult.getSubject().getSubjectName());
        forthResult.setScore(70);
        assertEquals(70, forthResult.getScore());

        thirdStudent = new Student("John", 13);
        assertEquals("English", result.getSubject().getSubjectName());
        assertEquals(1, result.getSubject().getSubjectNumber());
        result.setScore(50);
        assertEquals(50, result.getScore());
        assertEquals("Mathematics",secondResult.getSubject().getSubjectName() );
        assertEquals(2, secondResult.getSubject().getSubjectNumber());
        secondResult.setScore(70);
        assertEquals(70, secondResult.getScore());
        assertEquals("Civic Education",thirdResult.getSubject().getSubjectName());
        assertEquals(3, thirdResult.getSubject().getSubjectNumber());
        thirdResult.setScore(63);
        assertEquals(63, thirdResult.getScore());
        assertEquals("Basic Science",forthResult.getSubject().getSubjectName());
        forthResult.setScore(76);
        assertEquals(76, forthResult.getScore());

        forthStudent = new Student("Lola", 14);
        assertEquals("English", result.getSubject().getSubjectName());
        assertEquals(1, result.getSubject().getSubjectNumber());
        result.setScore(67);
        assertEquals(67, result.getScore());
        assertEquals("Mathematics",secondResult.getSubject().getSubjectName() );
        assertEquals(2, secondResult.getSubject().getSubjectNumber());
        secondResult.setScore(92);
        assertEquals(92, secondResult.getScore());
        assertEquals("Civic Education",thirdResult.getSubject().getSubjectName());
        assertEquals(3, thirdResult.getSubject().getSubjectNumber());
        thirdResult.setScore(83);
        assertEquals(83, thirdResult.getScore());
        assertEquals("Basic Science",forthResult.getSubject().getSubjectName());
        forthResult.setScore(94);
        assertEquals(94, forthResult.getScore());

    }
    }

