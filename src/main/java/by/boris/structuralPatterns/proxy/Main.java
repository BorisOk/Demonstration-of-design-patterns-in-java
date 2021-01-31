package by.boris.structuralPatterns.proxy;
/** Runner class */
public class Main {
    public static void main(String[] args) {
        // c паттерном заместитель
        Woman woman1 = new ProxyWoman();
        woman1.ready();

        System.out.println("------------");

        // без паттерна заместитель
        Woman woman2 = new Wife();
        woman2.ready();
    }
}
