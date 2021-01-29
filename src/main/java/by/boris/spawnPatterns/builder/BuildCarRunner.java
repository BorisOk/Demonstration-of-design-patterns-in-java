package by.boris.spawnPatterns.builder;
/** Runner class */
public class BuildCarRunner {
    public static void main(String[] args) {
        // будем иметь экземпляр определителя
        Determinant determinant = new Determinant();
        // установим для него билдера например new BugattiCarBuilder() или new KamazCarBuilder()
        determinant.setBuilder(new BugattiCarBuilder());
        // создаем экземпляр веб сайта
        Car car = determinant.builderCar();
        // выводим инфу по нашему веб сайту
        System.out.println(car);
    }
}
