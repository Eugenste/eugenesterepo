package ua.training.newspapers;

import java.util.ArrayList;
import java.util.List;

public class Typography implements Observed {
    private Newspapers newspapers;

    private List<Observer> observers = new ArrayList<>();

    public Newspapers getNewspapers() {
        return newspapers;
    }

    public void setNewspapers(Newspapers newspapers) {
        this.newspapers = newspapers;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.handleNewspaper(newspapers));
    }
}
