package by.boris.spawnPatterns.abstractFactory.factory_implement_aircraft;

import by.boris.spawnPatterns.abstractFactory.transport_interface.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU-134 flight");
    }
}
