package by.boris.spawnPatterns.abstractFactory.factory_implement_aircraft;

import by.boris.spawnPatterns.abstractFactory.transport_interface.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boeing-747 flight");
    }
}
