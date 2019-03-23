package pl.sda.javagda21.Behavioral.Strategy.Zadanie1;

import pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies.FormatterInverter;
import pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies.FormatterSplitter;
import pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies.FormatterUpper;
import pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies.IFormatterCzcionki;

public class Main {
    public static void main(String[] args) {

        Drukarka drukarka = new Drukarka();

drukarka.setFormatterCzcionki(new FormatterSplitter());

        System.out.println(drukarka.drukuj("Kolacja"));




    }
}
