package by.boris.structuralPatterns.decorator.decorators;

import by.boris.structuralPatterns.decorator.objects.Component;

public abstract class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
