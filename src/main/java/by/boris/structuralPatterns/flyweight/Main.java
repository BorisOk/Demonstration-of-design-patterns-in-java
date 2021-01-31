package by.boris.structuralPatterns.flyweight;
import java.util.ArrayList;
import java.util.List;

/** Runner class */
public class Main {
    public static void main(String[] args) {
        TeacherFlyweight teacherFlyweight = new TeacherFlyweight();

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacherFlyweight.getTeacherByLanguage("English"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("English"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("Russian"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("Russian"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("Russian"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("Russian"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("Russian"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("French"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("French"));
        teacherList.add(teacherFlyweight.getTeacherByLanguage("English"));

        teacherList.forEach(Teacher::teaches);
    }
}
