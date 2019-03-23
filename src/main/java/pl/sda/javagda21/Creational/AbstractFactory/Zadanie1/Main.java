package pl.sda.javagda21.Creational.AbstractFactory.Zadanie1;

import pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage.AsusPC;
import pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage.PcFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println(AsusPC.createAsusN53());

//        AsusPC asusPC = new AsusPC(); nie można tworzyć

        System.out.println(PcFactory.createHp66jwt());

    }
}
