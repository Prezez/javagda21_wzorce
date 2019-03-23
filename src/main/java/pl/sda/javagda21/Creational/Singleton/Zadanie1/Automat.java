package pl.sda.javagda21.Creational.Singleton.Zadanie1;

public class Automat implements IGeneratorTicketow{
    public int generujTicket() {
//        return Generator.getInstance().pobierzNastepnyNumerek();
        return  Generator.INSTANCE.pobierzNastepnyNumerek();
    }
}
