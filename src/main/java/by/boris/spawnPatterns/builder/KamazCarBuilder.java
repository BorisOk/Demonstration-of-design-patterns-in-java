package by.boris.spawnPatterns.builder;
/** CarBuilder это сущнасть которая конструирует машины (сущнасть абстрактная)
 Создаем реализацию CarBuilder машины KAMAZ-65207. */
public class KamazCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("KAMAZ-65207");
    }

    @Override
    void buildType() {
        car.setType(Type.TRUCK);
    }

    @Override
    void buildPrice() {
        car.setPrice(1000);
    }
}
