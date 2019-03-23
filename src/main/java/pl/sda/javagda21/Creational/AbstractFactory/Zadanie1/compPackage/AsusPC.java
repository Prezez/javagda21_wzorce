package pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage;

import static pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage.COMPUTER_BRAND.ASUS;

public class AsusPC extends AbstractPC {

    private AsusPC(String nazwa, int cpuPower, int gpuPower, boolean isOverclocked) {
        super(nazwa, ASUS, cpuPower, gpuPower, isOverclocked);
    }

    public static AsusPC createAsusN53 () {
        return new AsusPC("N53", 50, 50, true);
    }

    public static AsusPC createAsusJ007 () {
        return new AsusPC("J007", 120, 3, true);
    }

    @Override
    public String toString() {
        return "AsusPC{" +
                "nazwa='" + nazwa + '\'' +
                ", computer_brand=" + computer_brand +
                ", cpuPower=" + cpuPower +
                ", gpuPower=" + gpuPower +
                ", isOverclocked=" + isOverclocked +
                '}';
    }
}
