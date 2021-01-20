package by.boris.spawnPatterns.factory;
import by.boris.spawnPatterns.factory.implementationDeveloperFactory.JSDeveloperFactory;
import by.boris.spawnPatterns.factory.implementationDeveloperFactory.JavaDeveloperFactory;
import by.boris.spawnPatterns.factory.implementationDeveloperFactory.PhpDeveloperFactory;

/** Паттерн FactoryMethod (фабрика или фабричный метод) - цель его создание интерфейса, который
 создает обьекты. При этом выбор того, экземпляр какого именно класса будет создан остается за
 классами, которые реализуют (имплементируют) данный интерфейс.

 Этот шаблон используется для: делегирования полномочий (передачи полномочий) создания обьекта
 другому классу.

 Пример использования:
 * зарание не известно, экземпляры, какого класса нужно будет создать.
 * класс спроектирован так, что создаваемые им обьекты имеют свойства определенного класса. */

public class Main {
    public static void main(String[] args) {
        // Выбор: ("java" или "php" или "js")
        DeveloperFactory developerFactory = createDeveloperBySpecialty("js");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) { return new JavaDeveloperFactory(); }
        if (specialty.equalsIgnoreCase("php")) { return new PhpDeveloperFactory(); }
        if (specialty.equalsIgnoreCase("js")) { return new JSDeveloperFactory(); }

        throw  new RuntimeException(specialty + " is unknown specialty");
    }
}
