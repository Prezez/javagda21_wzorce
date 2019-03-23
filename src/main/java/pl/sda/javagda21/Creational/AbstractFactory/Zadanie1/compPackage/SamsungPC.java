package pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage;

public class SamsungPC extends AbstractPC {
    public SamsungPC(String nazwa, COMPUTER_BRAND computer_brand, int cpuPower, int gpuPower, boolean isOverclocked) {
        super(nazwa, computer_brand, cpuPower, gpuPower, isOverclocked);
    }
}
