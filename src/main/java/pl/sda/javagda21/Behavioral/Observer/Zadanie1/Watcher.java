package pl.sda.javagda21.Behavioral.Observer.Zadanie1;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

    private String imie;
    private int panicLevel;

    public Watcher(String imie, int panicLevel) {
        this.imie = imie;
        this.panicLevel = panicLevel;
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof Message) {
            Message wiadomosc = (Message) arg;

            if (wiadomosc.getLevel()>panicLevel){
        System.out.println("Otrzymałem (" + imie + "): " + wiadomosc.getMessage());}
            else {
                System.out.println("Dostarczono do: " + imie);
            }
    }}
}
