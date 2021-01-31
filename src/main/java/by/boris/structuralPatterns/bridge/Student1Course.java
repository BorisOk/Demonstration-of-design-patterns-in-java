package by.boris.structuralPatterns.bridge;

public class Student1Course implements Student{
    @Override
    public void writes() {
        System.out.print("Все студенты 1-го курса пишут курсовую... ");
    }
}
