package by.boris.spawnPatterns.abstractFactory.factory_implement;

import by.boris.spawnPatterns.abstractFactory.factory_implement_aircraft.TU134;
import by.boris.spawnPatterns.abstractFactory.factory_implement_car.Lada;
import by.boris.spawnPatterns.abstractFactory.factory_interface.TransportFactory;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Aircraft;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Lada();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
