package by.boris.spawnPatterns.abstractFactory.factory_implement;

import by.boris.spawnPatterns.abstractFactory.factory_implement_aircraft.Boeing747;
import by.boris.spawnPatterns.abstractFactory.factory_implement_car.Ford;
import by.boris.spawnPatterns.abstractFactory.factory_interface.TransportFactory;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Aircraft;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
