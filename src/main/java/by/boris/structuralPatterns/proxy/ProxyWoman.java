package by.boris.structuralPatterns.proxy;

public class ProxyWoman implements Woman {
    Woman wife = new Wife();

    @Override
    public void ready() {
        System.out.print("Вкусно! ");
        wife.ready();
    }
}
