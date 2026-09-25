package student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
        private Student student;

        @BeforeEach
        public void createStudentObject (){
            student =new Student();
        }
        @Test
        public void testThatSetStudentName(){
            student.setStudentName("john");
            assertEquals("john", student.getStudentName());
        }
        @Test
        public void testThatSetGradeLevel(){
            student.setGradeLevel(11);
            assertEquals(11, student.getGradeLevel());
        }
        @Test
        public void testThatStudentGradeIncreaseByOne(){
            student.setGradeLevel(11);
            student.increaseTheGrade();
            assertEquals(12, student.getGradeLevel());
        }
        @Test
        public void testThatStudentGradeDoNotIncreaseWhenItIsTwelve(){
            student.setGradeLevel(12);
            student.increaseTheGrade();
            assertEquals(12, student.getGradeLevel());
        }
        @Test
        public void testThatThrowsErrorWhenStudentGradeIsBelowOne(){
            student.setGradeLevel(0);
            assertThrows(IllegalArgumentException.class, () ->{ student.increaseTheGrade();});
        }
        @Test
        public void testThatCheckIfStudentIsGraduating(){
            student.setGradeLevel(11);
            student.increaseTheGrade();
            student.isGraduating();
            assertTrue (student.isGraduating());
        }
        @Test
        public void testThatUpdateStudentName(){
            student.setStudentName("John");
            assertEquals("John", student.getStudentName());
            student.updateName("Lucas");
            assertEquals("Lucas",  student.getStudentName());
        }
    }
