package pl.sda.javagda21.Behavioral.Observer.Zadanie2;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Watcher implements ChangeListener<News> {

    private String imie;
    private int panicLevel;

    public Watcher(String imie, int panicLevel) {
        this.imie = imie;
        this.panicLevel = panicLevel;
    }

    public void changed(ObservableValue<? extends News> observable, News oldValue, News wiadomosc) {
        if (wiadomosc.getLevel() > panicLevel) {
            System.out.println("Wpadam w Panikę! (" + imie + ") " + wiadomosc.getMessage());
        } else {
            System.out.println("Otrzynalem (" + imie + "): " + wiadomosc.getMessage());
        }
    }
}

