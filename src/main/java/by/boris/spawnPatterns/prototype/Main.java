package by.boris.spawnPatterns.prototype;
/** Класс Runner
    Показано как клонируем человека по имени Том. */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cache cache = new Cache();
        Person person = new Person("Tom");

        cache.setPerson(person);
        Person personClone = cache.getPerson();

        System.out.println(person);
        System.out.println(personClone);
    }
}
