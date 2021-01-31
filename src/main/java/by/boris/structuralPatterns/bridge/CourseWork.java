package by.boris.structuralPatterns.bridge;

public abstract class CourseWork {
    protected Student student;

    public CourseWork(Student student) {
        this.student = student;
    }

    public abstract void studentCourseWork();
}
