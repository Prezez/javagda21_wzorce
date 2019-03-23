package pl.sda.javagda21.Creational.AbstractFactory.Zadanie1.compPackage;

public abstract class AbstractPC {

    public String nazwa;
    public COMPUTER_BRAND computer_brand;
    public int cpuPower;
    public int gpuPower;
    public boolean isOverclocked;

    public AbstractPC(String nazwa, COMPUTER_BRAND computer_brand, int cpuPower, int gpuPower, boolean isOverclocked) {
        this.nazwa = nazwa;
        this.computer_brand = computer_brand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.isOverclocked = isOverclocked;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public COMPUTER_BRAND getComputer_brand() {
        return computer_brand;
    }

    public void setComputer_brand(COMPUTER_BRAND computer_brand) {
        this.computer_brand = computer_brand;
    }

    public int getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(int cpuPower) {
        this.cpuPower = cpuPower;
        if (this.cpuPower > 100) {
            this.cpuPower = 100;
        } else if (cpuPower < 0) {
            this.cpuPower = 0;
        }
    }

    public int getGpuPower() {
        return gpuPower;
    }

    public void setGpuPower(int gpuPower) {
        this.gpuPower = gpuPower;
        if (this.gpuPower > 100) {
            this.gpuPower = 100;
        } else if (this.gpuPower < 0) {
            this.gpuPower = 0;
        }
    }

    public boolean isOverclocked() {
        return isOverclocked;
    }

    public void setOverclocked(boolean overclocked) {
        isOverclocked = overclocked;
    }
}
