package Assignment4.Observer;

import java.util.ArrayList;

public class NewsPublisherImpl implements NewsPublisher {
    private ArrayList<Observer> observers;

    public NewsPublisherImpl() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObservers(String newsCategory, String newsTitle){
        for (Observer observer : observers) {
            observer.update(newsCategory, newsTitle);
        }
    }
}
