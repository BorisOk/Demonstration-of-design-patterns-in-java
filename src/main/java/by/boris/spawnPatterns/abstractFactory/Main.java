package by.boris.spawnPatterns.abstractFactory;
import by.boris.spawnPatterns.abstractFactory.factory_implement.RussianFactory;
import by.boris.spawnPatterns.abstractFactory.factory_implement.USAFactory;
import by.boris.spawnPatterns.abstractFactory.factory_interface.TransportFactory;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Aircraft;
import by.boris.spawnPatterns.abstractFactory.transport_interface.Car;

/** Паттерн Abstract Factory (Абстрактная фабрика) - фабрика по созданию семейства обьектов
        разных типов. (в отличии от фабричного метода где возвращаются экземпляр одного типа)
    - Обькты внутри фабрики связаны по смыслу или задаче но не связаны по типу.
    - Более расширеный вариант шаблона (Фабричный метод) */
public class Main {
    public static TransportFactory transportFactory;

    public static void main(String[] args) {
        // например может придти число 1 или любое другое (где 1 Русская фабрика а любое другое Американская)
        int came = 5;

        if (came == 1) {
            transportFactory = new RussianFactory();
        } else {
            transportFactory = new USAFactory();
        }

        // создание и полет самолета по пришедшему условию
        Aircraft aircraft = transportFactory.createAircraft();
        aircraft.flight();

        // создание и характеристики автомобиля по пришедшему условию
        Car car = transportFactory.createCar();
        car.drive();
        car.stop();
    }
}
