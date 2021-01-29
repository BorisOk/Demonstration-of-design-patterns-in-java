package by.boris.structuralPatterns.decorator;
import by.boris.structuralPatterns.decorator.decorators.ThemeDecorator;
import by.boris.structuralPatterns.decorator.decorators.TimeDecorator;
import by.boris.structuralPatterns.decorator.objects.Component;
import by.boris.structuralPatterns.decorator.objects.InteliJIdea;
import by.boris.structuralPatterns.decorator.objects.MySQL;

public class Main {
    public static void main(String[] args) {
        // старый функционал MySQL
        System.out.println("--------------- (Old)");
        Component oldMySQL = new MySQL();
        oldMySQL.draw();

        // старый функционал InteliJIdea
        Component oldInteliJIdea = new InteliJIdea();
        oldInteliJIdea.draw();

        System.out.println("--------------- (New)");
        // новый функционал MySQL с добовление возможности применить темную тему
        Component newMySQL = new ThemeDecorator(new MySQL());
        newMySQL.draw();

        // новый функционал InteliJIdea с добавлением гвозможности применить темную тему и время на гавную страницу
        Component newInteliJIdea = new ThemeDecorator(new TimeDecorator(new InteliJIdea()));
        newInteliJIdea.draw();
    }
}
