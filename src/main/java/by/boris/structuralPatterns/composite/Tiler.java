package by.boris.structuralPatterns.composite;

public class Tiler implements Worker {
    @Override
    public void does() {
        System.out.println("Кладет плитку..");
    }
}
