package by.boris.behaviorPatterns.observer.Subscriber;

public class Subscriber2 implements PublisherActionListener {
    @Override
    public void doAction(String massage) {
        System.out.println(massage + " : from " + this.getClass().getName());
    }
}
