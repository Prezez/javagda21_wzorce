package pl.sda.javagda21.Creational.Builder.Zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        GameCharacter.Builder builder = new GameCharacter.Builder();
        GameCharacter.Builder builder2 = new GameCharacter.Builder();
        GameCharacter john = builder
                .setName("John")
                .setHealth(100)
                .setMana(58)
                .create();

        GameCharacter erwin = builder
                .setName("Erwin")
                .setHealth(100)
                .setMana(59)
                .create();

        GameCharacter johny = builder
                .setName("John")
                .setHealth(100)
//                .setMana(58)
                .create();

        GameCharacter jim = builder2
                .setName("Jim")
                .setHealth(102)
                .setMana(83)
                .setNumberOfPoints(25)
                .create();

        System.out.println(john);

        List list = new ArrayList(Arrays.asList(jim, john, johny, erwin));
        System.out.println(list);
    }
}
