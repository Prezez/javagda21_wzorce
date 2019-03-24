package pl.sda.javagda21.Behavioral.Observer.Zadanie1;

import java.util.Observable;

public class NewsStation extends Observable {

    public void dodajOgladajacego (Watcher watcher) {
        addObserver(watcher);
    }

    public void powiadomOWiadomosci(String wiadomosc, int level){
        setChanged();
        notifyObservers(new Message(level, wiadomosc));
    }
}
