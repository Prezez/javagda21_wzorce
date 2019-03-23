package pl.sda.javagda21.Behavioral.Strategy.Zadanie1.strategies;

public class FormatterInverter implements IFormatterCzcionki {
    public String zamienTekst(String tekst) {
        char[] chars = tekst.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
