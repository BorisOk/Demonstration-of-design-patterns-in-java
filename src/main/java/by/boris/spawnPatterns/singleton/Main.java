package by.boris.spawnPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        // Lazy initialization
        SingletonLazy.getInstance().print();
        SingletonLazy.getInstance().print();

        // Not lazy initialization
        System.out.println(SingletonNotLazy.instance);
        System.out.println(SingletonNotLazy.instance);
    }
}
