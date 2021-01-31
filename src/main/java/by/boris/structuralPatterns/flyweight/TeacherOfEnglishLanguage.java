package by.boris.structuralPatterns.flyweight;

public class TeacherOfEnglishLanguage implements Teacher {
    @Override
    public void teaches() {
        System.out.println("Учит Английскому языку!");
    }
}
