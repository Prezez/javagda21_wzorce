package pl.sda.javagda21.Behavioral.Observer.Zadanie1;

public class Main {
    public static void main(String[] args) {
        NewsStation newsStation = new NewsStation();

        newsStation.dodajOgladajacego(new Watcher("Marian",1));
        newsStation.dodajOgladajacego(new Watcher("Janek",5));
        newsStation.dodajOgladajacego(new Watcher("Olek",10));
        newsStation.dodajOgladajacego(new Watcher("Arek",3));
        newsStation.dodajOgladajacego(new Watcher("Ania",2));
        newsStation.dodajOgladajacego(new Watcher("Gosia",8));

        newsStation.powiadomOWiadomosci("Cośtam się dzieje.", 6);
    }
}
