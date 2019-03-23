package pl.sda.javagda21.Behavioral.Strategy.Zadanie1;

import pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies.FormatterLower;
import pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies.IFormatterCzcionki;

public class Drukarka {
    private IFormatterCzcionki formatterCzcionki;

    public void setFormatterCzcionki(IFormatterCzcionki formatterCzcionki) {
        this.formatterCzcionki = formatterCzcionki;
    }

    public String drukuj (String tekst){

        return formatterCzcionki.zamienTekst(tekst);
    }
}
