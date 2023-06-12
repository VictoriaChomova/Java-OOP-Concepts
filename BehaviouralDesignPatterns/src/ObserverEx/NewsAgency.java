package ObserverEx;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    public List<Observer> observers = new ArrayList<> ();

    public void setNews(String news) {
        notifyObservers (news);
    }

    public void registerObserver(Observer observer) {
        observers.add (observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove (observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update (message);
        }
    }
}
