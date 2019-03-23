package pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies;

public class FormatterSplitter implements IFormatterCzcionki {
    public String zamienTekst(String tekst) {

        String[] split = tekst.split("");
        StringBuilder stringBuilder = new StringBuilder(tekst);

        for (int i = tekst.length() - 1; i > 0; i--) {
            stringBuilder.insert(i, " ");
            stringBuilder.toString();
        }

        return stringBuilder.toString();
    }
}
