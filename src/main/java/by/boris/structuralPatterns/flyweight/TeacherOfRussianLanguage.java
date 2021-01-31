package by.boris.structuralPatterns.flyweight;

public class TeacherOfRussianLanguage implements Teacher {
    @Override
    public void teaches() {
        System.out.println("Учит Русскому языку!");
    }
}
