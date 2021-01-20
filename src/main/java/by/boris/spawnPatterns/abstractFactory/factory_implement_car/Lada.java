package by.boris.spawnPatterns.abstractFactory.factory_implement_car;

import by.boris.spawnPatterns.abstractFactory.transport_interface.Car;

public class Lada implements Car {

    @Override
    public void drive() {
        System.out.println("Rides 100 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stops 5 seconds");
    }
}
