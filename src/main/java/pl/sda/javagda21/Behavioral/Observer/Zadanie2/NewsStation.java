package pl.sda.javagda21.Behavioral.Observer.Zadanie2;

import javafx.beans.property.SimpleObjectProperty;

public class NewsStation {

    private SimpleObjectProperty<News> newsProperty = new SimpleObjectProperty<>();

    public void dodajOgladajacego(Watcher watcher) {
        newsProperty.addListener(watcher);
    }

    public void powiadomOWiadomosci(String wiadomosc, int level) {
        newsProperty.setValue(new News(level, wiadomosc));
    }
}
