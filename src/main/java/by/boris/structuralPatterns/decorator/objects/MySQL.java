package by.boris.structuralPatterns.decorator.objects;

public class MySQL implements Component {

    @Override
    public void draw() {
        System.out.println("Draw MySQL");
    }
}
