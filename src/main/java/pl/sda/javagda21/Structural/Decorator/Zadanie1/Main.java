package pl.sda.javagda21.Structural.Decorator.Zadanie1;

public class Main {
    public static void main(String[] args) {

        SimplePizza simplePizza = new SimplePizza();
        CustomPizza customPizza = new CustomPizza(simplePizza);
        customPizza
                .dodajSkldaniki("Ogórek")
                .dodajSkldaniki("Majonez")
                .dodajSkldaniki("Kabaczki")
                .dodajSkldaniki("Szyna");

        System.out.println(customPizza.getIngredients());
        System.out.println(customPizza.getPrice());

        IPizza pizza = Pizzeria.margheritta();

        System.out.println(pizza.getIngredients());
        System.out.println(pizza.getPrice());

    }
}
