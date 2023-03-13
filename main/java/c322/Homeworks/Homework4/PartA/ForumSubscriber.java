package c322.Homeworks.Homework4.PartA;

import java.util.ArrayList;
import java.util.List;

public class ForumSubscriber {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String message;

    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void postUpdate(String message) {
        this.message = message;
        notifyObservers();
    }
}
