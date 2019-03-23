package pl.sda.javagda21.Creational.Singleton.Zadanie1;

public class PostOffice {

    private Automat automat;
    private Internet internet;
    private Rejestracja rejestracja;

    public PostOffice() {
        this.automat = new Automat();
        this.internet = new Internet();
        this.rejestracja = new Rejestracja();
    }

    public int pobierzTicketZAutomatu () {
        return automat.generujTicket();
    }

    public int pobierzTicketPrzezInternet (){
        return internet.generujTicket();
    }

    public int pobierzTicketZRejestracji (){
        return rejestracja.generujTicket();
    }
}
