package pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage;

public class HpPC extends AbstractPC {
    HpPC(String nazwa, COMPUTER_BRAND computer_brand, int cpuPower, int gpuPower, boolean isOverclocked) {
        super(nazwa, computer_brand, cpuPower, gpuPower, isOverclocked);
    }

    @Override
    public String toString() {
        return "HpPC{" +
                "nazwa='" + nazwa + '\'' +
                ", computer_brand=" + computer_brand +
                ", cpuPower=" + cpuPower +
                ", gpuPower=" + gpuPower +
                ", isOverclocked=" + isOverclocked +
                '}';
    }
}
