package by.boris.spawnPatterns.abstractFactory.factory_interface;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Aircraft;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Car;

/** Фабрика по созданию транспортных средств (это наша абстрактная фабрика) */
public interface TransportFactory {

    Car createCar();
    Aircraft createAircraft();
}
