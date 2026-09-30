package studentgradetest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentgrade.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubjectTest {
    private Subject subject;

    @BeforeEach
    public void createSubject(){
        subject = new Subject("English", 1);
    }
    @Test
    public void testThatSetSubjectName(){
        subject.setSubjectName("English");
        assertEquals("English", subject.getSubjectName());
    }
    @Test
    public void testThatSetStudentNumber(){
        subject.setSubjectNumber(1);
        assertEquals(1, subject.getSubjectNumber());
    }
}
