package pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies;

public class FormatterLower implements IFormatterCzcionki {
    public String zamienTekst(String tekst) {
        return tekst.toLowerCase();
    }
}
