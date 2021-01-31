package by.boris.behaviorPatterns.observer.Pablisher;

import by.boris.behaviorPatterns.observer.Subscriber.PublisherActionListener;

import java.util.ArrayList;

/** Издатель. */

public class Publisher implements PublisherInterface {

    // список подписчиков
    ArrayList<PublisherActionListener> listeners = new ArrayList<>();

    @Override
    public ArrayList<PublisherActionListener> getListeners() {
        return listeners;
    }

    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListener() {
        listeners.clear();
    }

    @Override // отправка издательского сообщения подписчикам
    public void notifySubscribers(String massage) {
        for (PublisherActionListener listener: listeners) {
            listener.doAction(massage);
        }
    }


    // издатель пишет сообщение и они отправляются подписчикам
    public void createNewMessage(String message) {
        System.out.println("Publisher printed message: " + message);

        notifySubscribers(message);
    }
}
