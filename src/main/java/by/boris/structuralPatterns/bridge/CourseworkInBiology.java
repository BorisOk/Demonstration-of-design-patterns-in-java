package by.boris.structuralPatterns.bridge;

public class CourseworkInBiology extends CourseWork{

    public CourseworkInBiology(Student student) {
        super(student);
    }

    @Override
    public void studentCourseWork() {
        student.writes();
        System.out.println("ПО БИОЛОГИИ!");
    }
}
