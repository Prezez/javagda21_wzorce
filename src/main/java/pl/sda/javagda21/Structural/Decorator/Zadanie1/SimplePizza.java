package pl.sda.javagda21.Structural.Decorator.Zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePizza implements IPizza{

    private List<String> skladniki;
    private double cena;


    public SimplePizza() {
        this.skladniki = new ArrayList<>(Arrays.asList("Sos", "Ser"));
    }


    @Override
    public List<String> getIngredients() {
        return skladniki;
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
