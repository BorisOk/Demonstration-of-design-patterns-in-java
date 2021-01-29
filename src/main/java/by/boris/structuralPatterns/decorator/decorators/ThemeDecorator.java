package by.boris.structuralPatterns.decorator.decorators;

import by.boris.structuralPatterns.decorator.objects.Component;

public class ThemeDecorator extends Decorator{

    public ThemeDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...add the ability to apply a dark theme");
    }
}
