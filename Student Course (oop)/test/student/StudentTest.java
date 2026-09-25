package student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private Student student;

    @BeforeEach
    void createStudentObject(){
        student = new Student();
    }
    @Test
    void setStudentName(){
        student.setName("Aderonke");
        assertEquals("Aderonke", student.getName());
    }
    @Test
    void setStudentAge(){
        student.setAge(25);
        assertEquals(25, student.getAge());
    }
    @Test
    void setStudentDepartment(){
        student.setDepartment("Mathematics");
        assertEquals("Mathematics", student.getDepartment());
    }
    @Test
    void setStudentCourse(){
        Course course = new Course();
        course.setCourse("Math101");
        student.setCourseCode(course);
        assertEquals(course, student.getCourseCode());
    }
}
