package by.boris.spawnPatterns.factory.implementationDeveloper;

import by.boris.spawnPatterns.factory.Developer;

public class JSDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JS developer writes js code...");
    }
}
