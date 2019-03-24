package pl.sda.javagda21.Structural.Decorator.Zadanie1;

import java.util.ArrayList;
import java.util.List;

public class CustomPizza implements  IPizza{

    private SimplePizza simplePizza;
    private List <String> dodatkoweSkladniki = new ArrayList<>();

    public CustomPizza(SimplePizza simplePizza) {
        this.simplePizza = simplePizza;
    }

    public CustomPizza dodajSkldaniki (String skladnik){
        dodatkoweSkladniki.add(skladnik);
        return this;
    }


    @Override
    public List<String> getIngredients() {
        List<String>dodatki = new ArrayList<>(dodatkoweSkladniki);
        dodatki.addAll(simplePizza.getIngredients());

        return dodatki;
    }

    @Override
    public double getPrice() {
        return simplePizza.getPrice() + dodatkoweSkladniki.size()*2.50;
    }

    @Override
    public String toString() {
        return "CustomPizza{" +
                "simplePizza=" + simplePizza +
                ", dodatkoweSkladniki=" + dodatkoweSkladniki +
                '}';
    }
}
