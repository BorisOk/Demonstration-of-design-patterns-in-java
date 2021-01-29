package by.boris.spawnPatterns.builder;
/** CarBuilder это сущнасть которая конструирует машины (сущнасть абстрактная)
 Создаем реализацию CarBuilder машины Bugatti Veyron. */
public class BugattiCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Bugatti Veyron");
    }

    @Override
    void buildType() {
        car.setType(Type.PASSENGER_CAR);
    }

    @Override
    void buildPrice() {
        car.setPrice(5000000);
    }
}
