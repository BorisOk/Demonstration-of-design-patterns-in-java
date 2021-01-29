package by.boris.spawnPatterns.builder;
/** Создаем машину. Поля у него: Имя, Тип, Цена */
public class Car {
    private String name;
    private Type type;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
