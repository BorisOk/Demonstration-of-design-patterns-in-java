package by.boris.structuralPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeacherFlyweight {
    private static final Map<String, Teacher> teachers = new HashMap<>();

    public Teacher getTeacherByLanguage(String language) {
        Teacher teacher = teachers.get(language);

        if (teacher == null) {
            switch (language) {
                case "English":
                    System.out.println("Взяли на работу учителя Английского.");
                    teacher = new TeacherOfEnglishLanguage();
                    break;
                case "Russian":
                    System.out.println("Взяли на работу учителя Русского.");
                    teacher = new TeacherOfRussianLanguage();
                    break;
                case "French":
                    System.out.println("Взяли на работу учителя Французского.");
                    teacher = new TeacherOfFrenchLanguage();
            }
            teachers.put(language, teacher);
        }
        return teacher;
    }
}
