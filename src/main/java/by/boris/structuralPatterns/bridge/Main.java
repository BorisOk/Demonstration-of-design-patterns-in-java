package by.boris.structuralPatterns.bridge;
import java.util.Arrays;
import java.util.List;
/** Runner class.
    Тут видно что мы в любой момент можем добавить разные курсовые работы и студентов старших курсов. И легко
    можем поменять курсовую для 1-го и для второго 2-курса.*/
public class Main {
    public static void main(String[] args) {
        List<CourseWork> courseWorks = Arrays.asList(
                new CourseworkInBiology(new Student2Course()),
                new CourseworkInChemistry(new Student1Course()));

        courseWorks.forEach(CourseWork::studentCourseWork);
    }
}
