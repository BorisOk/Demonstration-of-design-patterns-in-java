package by.boris.structuralPatterns.composite;

public class Plasterer implements Worker {

    @Override
    public void does() {
        System.out.println("Штукатурит стены..");
    }
}
