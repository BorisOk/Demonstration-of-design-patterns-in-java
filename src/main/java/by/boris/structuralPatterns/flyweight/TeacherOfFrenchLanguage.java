package by.boris.structuralPatterns.flyweight;

public class TeacherOfFrenchLanguage implements Teacher {
    @Override
    public void teaches() {
        System.out.println("Учит Французскому языку!");
    }
}
