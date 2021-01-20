package by.boris.spawnPatterns.factory.implementationDeveloper;

import by.boris.spawnPatterns.factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
