package pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage;

public abstract class PcFactory {
    public static HpPC createHp85c() {
        return new HpPC("85C", COMPUTER_BRAND.HP, 50, 85, true);
    }

    public static HpPC createHp66jwt() {
        return new HpPC("66JWT", COMPUTER_BRAND.HP, 110, 15, false);
    }

}
