package by.boris.spawnPatterns.builder;
/** Сущнасть которая конструирует машины (сущнасть абстрактная) */
public abstract class CarBuilder {
    Car car;
    // будет возвращать новую машину
    void createCar() {
        car = new Car();
    }

    abstract void buildName();
    abstract void buildType();
    abstract void buildPrice();

    // будет просто возвращать машину
    public Car getCar() {
        return car;
    }
}
