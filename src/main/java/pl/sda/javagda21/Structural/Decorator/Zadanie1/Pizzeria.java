package pl.sda.javagda21.Structural.Decorator.Zadanie1;

public class Pizzeria {
    public static IPizza margheritta (){
        return new CustomPizza(new SimplePizza()).dodajSkldaniki("Oregano");
    }

    public static IPizza pineapple () {
        return new CustomPizza(new SimplePizza())
                .dodajSkldaniki("Ananas")
                .dodajSkldaniki("Oregano");

    }
}
