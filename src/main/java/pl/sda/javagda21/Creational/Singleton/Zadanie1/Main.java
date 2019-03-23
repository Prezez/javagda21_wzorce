package pl.sda.javagda21.Creational.Singleton.Zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PostOffice poczta = new PostOffice();

        boolean isWorking = true;
        while (isWorking) {
            String line = sc.nextLine().trim().toLowerCase();

            if (line.startsWith("quit")) {
                break;
            } else if (line.startsWith("automat")) {
                int numerek = poczta.pobierzTicketZAutomatu();
                System.out.println("Twój szczęśliwy numerek to: " + numerek);
            } else if (line.startsWith("internet")) {
                int numerek = poczta.pobierzTicketPrzezInternet();
                System.out.println("Twój szczęśliwy numerek to: " + numerek);
            } else if (line.startsWith("rejestracja")) {
                int numerek = poczta.pobierzTicketZRejestracji();
                System.out.println("Twój szczęśliwy numerek to: " + numerek);
            } else {
                System.out.println("Nie rozumie");
            }
        }
    }
}