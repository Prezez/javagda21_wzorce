package pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies;

public class FormatterTrim implements IFormatterCzcionki {
    public String zamienTekst(String tekst) {
        return tekst.trim();
    }
}
