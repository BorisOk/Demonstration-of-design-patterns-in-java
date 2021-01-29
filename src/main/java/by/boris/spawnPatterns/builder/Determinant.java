package by.boris.spawnPatterns.builder;
/** Этот класс будет определять какой класс мы будем создавать (BugattiCarBuilder() или KamazCarBuilder())
    Прелесть этого класса то что мы здесь можем использовать любую реализацию абстрактного класса CarBuilder. */
public class Determinant {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    // будет возвращать определенную машину
    Car builderCar() {
        builder.createCar();
        builder.buildName();
        builder.buildType();
        builder.buildPrice();

        return builder.getCar();
    }
}
