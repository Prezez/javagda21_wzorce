package pl.sda.javagda21.Creational.Builder.Zadanie2;

public class Main {
    public static void main(String[] args) {

        Stamp.Builder stampBuilder = new Stamp.Builder();
        Stamp stamp = stampBuilder
                .setFirstDayNumber(0)
                .setSecondDayNumber(1)
                .setFirstMonthNumber(0)
                .setSecondMonthNumber(1)
                .setYearNumber1(2)
                .setYearNumber2(0)
                .setYearNumber3(1)
                .setYearNumber4(9)
                .setCaseNumber(1)
                .createStamp();

        System.out.println(stamp);

    }
}
