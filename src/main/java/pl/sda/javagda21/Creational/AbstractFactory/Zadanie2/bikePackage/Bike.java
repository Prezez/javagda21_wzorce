package pl.sda.javagda21.Creational.AbstractFactory.Zadanie2.bikePackage;

import lombok.Data;

@Data
public class Bike {

    private String marka;
    private int liczbaMiejsc;
    private int iloscPrzerzutek;
    private TypRoweru typRoweru;


     Bike(String marka, int liczbaMiejsc, int iloscPrzerzutek, TypRoweru typRoweru) {
        this.marka = marka;
        this.liczbaMiejsc = liczbaMiejsc;
        this.iloscPrzerzutek = iloscPrzerzutek;
        this.typRoweru = typRoweru;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public int getIloscPrzerzutek() {
        return iloscPrzerzutek;
    }

    public void setIloscPrzerzutek(int iloscPrzerzutek) {
        this.iloscPrzerzutek = iloscPrzerzutek;
    }

    public TypRoweru getTypRoweru() {
        return typRoweru;
    }

    public void setTypRoweru(TypRoweru typRoweru) {
        this.typRoweru = typRoweru;
    }
}
