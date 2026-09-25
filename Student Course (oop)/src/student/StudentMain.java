package student;

public class StudentMain {
    public static void main(String... args) {
        Course courseOne = new Course("Math101");
        Course courseTwo = new Course("Com201");
        Student studentOne = new Student("David", 25,courseOne,"Mathematics" );
        Student studentTwo = new Student("John", 21,courseTwo,"Computer Science" );

        studentOne.introduce();
        studentTwo.introduce();

        studentOne.study();
        studentTwo.study();
    }
}
