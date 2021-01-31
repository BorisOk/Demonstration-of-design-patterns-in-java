package by.boris.structuralPatterns.bridge;

public class CourseworkInChemistry extends CourseWork{

    public CourseworkInChemistry(Student student) {
        super(student);
    }

    @Override
    public void studentCourseWork() {
        student.writes();
        System.out.println("ПО ХИМИИ!");
    }
}