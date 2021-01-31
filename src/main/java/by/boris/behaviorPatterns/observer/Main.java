package by.boris.behaviorPatterns.observer;
import by.boris.behaviorPatterns.observer.Pablisher.Publisher;
import by.boris.behaviorPatterns.observer.Subscriber.Subscriber1;
import by.boris.behaviorPatterns.observer.Subscriber.Subscriber2;
/** Runner class. Создаем издателя. У которого будет 2 подписчика. При добавлении сообщения у
    издателя подписчики получают эти сообщения. */
public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher(); // создали издателя
        publisher.addListener(new Subscriber1()); // добавили подписчика1
        publisher.addListener(new Subscriber2()); // добавили подписчика2

        // тут издатель добавил сообщение которое отправляется всем подписчикам.
        publisher.createNewMessage("Massage!!!");
    }
}
