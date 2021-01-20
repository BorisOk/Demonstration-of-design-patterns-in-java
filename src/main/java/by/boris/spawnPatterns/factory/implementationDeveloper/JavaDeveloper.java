package by.boris.spawnPatterns.factory.implementationDeveloper;

import by.boris.spawnPatterns.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
