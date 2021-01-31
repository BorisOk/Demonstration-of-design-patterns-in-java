package by.boris.behaviorPatterns.observer.Pablisher;
import by.boris.behaviorPatterns.observer.Subscriber.PublisherActionListener;

import java.util.ArrayList;

/** Интерфейс для создания издателя. */

public interface PublisherInterface {

    // получение подписчиков
    ArrayList<PublisherActionListener> getListeners();

    // добавление подписчика
    void addListener(PublisherActionListener listener);

    // удаление подписчика
    void removeListener(PublisherActionListener listener);

    // удаление подписчиков
    void removeAllListener();

    // отправка издательского сообщения подписчикам
    void notifySubscribers(String massage);
}
