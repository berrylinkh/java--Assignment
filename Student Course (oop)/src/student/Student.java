package student;

public class Student {
    private String name;
    private int age;
    private Course courseCode;
    private String department;

    public Student (String name, int age, Course courseCode, String department){
        this.name =name;
        this.age = age;
        this.courseCode =courseCode;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String  getName() {
        return name;
    }

    public void setAge(int age) {
        this.age =age;
    }

    public int getAge() {
        return age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setCourseCode (Course courseCode) {
        this.courseCode = courseCode;
    }

    public Course getCourseCode() {
        return courseCode;
    }
    public void introduce(){
        System.out.println("My name is "+name);
        System.out.println("I am "+age +"years");
        System.out.println("My course is "+courseCode.getCourse());
        System.out.println("My department is "+department);
        System.out.println();
    }
    public void study(){
        System.out.println(name + " is studying" + courseCode.getCourse() + " in the"+department+ " department ");
    }
}
