package by.boris.structuralPatterns.bridge;

public class Student2Course implements Student{
    @Override
    public void writes() {
        System.out.print("Все студенты 2-го курса пишут курсовую... ");
    }
}