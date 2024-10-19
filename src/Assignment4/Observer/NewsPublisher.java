package Assignment4.Observer;

public interface NewsPublisher {
    void addObserver(Observer observer);
    void notifyObservers(String newsCategory, String newsTitle);
}
