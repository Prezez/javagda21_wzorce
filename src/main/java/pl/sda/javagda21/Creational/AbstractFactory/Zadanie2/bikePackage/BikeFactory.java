package pl.sda.javagda21.Creational.AbstractFactory.Zadanie2.bikePackage;

public abstract class BikeFactory {

    public static Bike createKross5gear (){
        return new Bike("Kross", 1, 5, TypRoweru.BICYCLE);
    }

    public static Bike createIniana3gear () {
        return new Bike("Iniana", 2, 3, TypRoweru.TANDEM);
    }


}
