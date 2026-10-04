package studentgrade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentgrade.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class SubjectTest {
        private Subject subject;
        private Subject secondSubject;
        private Subject thirdSubject;
        private Subject forthSubject;

        @BeforeEach
        public void createSubject(){
            subject = new Subject("English", 1);
            secondSubject = new Subject("Mathematics", 2);
            thirdSubject = new Subject("Civic Education", 3);
            forthSubject = new Subject("Basic Science", 4);
        }
        @Test
        public void testThatSetSubjectName(){
            subject.setSubjectName("English");
            secondSubject.setSubjectName("Mathematis");
            thirdSubject.setSubjectName("Civic Education");
            forthSubject.setSubjectName("Basic Science");
            assertEquals("English", subject.getSubjectName());
            assertEquals("Mathematis", secondSubject.getSubjectName());
            assertEquals("Civic Education", thirdSubject.getSubjectName());
            assertEquals("Basic Science", forthSubject.getSubjectName());
        }
        @Test
        public void testThatSetStudentNumber(){
            subject.setSubjectNumber(1);
            secondSubject.setSubjectNumber(2);
            thirdSubject.setSubjectNumber(3);
            forthSubject.setSubjectNumber(4);
            assertEquals(1, subject.getSubjectNumber());
        }
    }


