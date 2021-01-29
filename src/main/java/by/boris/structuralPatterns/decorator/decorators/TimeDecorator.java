package by.boris.structuralPatterns.decorator.decorators;

import by.boris.structuralPatterns.decorator.objects.Component;

public class TimeDecorator extends Decorator {
    public TimeDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...add time display on the main page");
    }
}
