package by.boris.spawnPatterns.factory.implementationDeveloperFactory;

import by.boris.spawnPatterns.factory.Developer;
import by.boris.spawnPatterns.factory.DeveloperFactory;
import by.boris.spawnPatterns.factory.implementationDeveloper.JSDeveloper;

public class JSDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JSDeveloper();
    }
}
