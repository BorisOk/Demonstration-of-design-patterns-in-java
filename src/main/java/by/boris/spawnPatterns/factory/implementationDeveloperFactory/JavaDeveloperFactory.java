package by.boris.spawnPatterns.factory.implementationDeveloperFactory;

import by.boris.spawnPatterns.factory.Developer;
import by.boris.spawnPatterns.factory.DeveloperFactory;
import by.boris.spawnPatterns.factory.implementationDeveloper.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
