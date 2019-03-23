package pl.sda.javagda21.Creational.Singleton.Zadanie1;

public enum Generator {
    INSTANCE;
//    private static Generator ourInstance = new Generator();
//
//    public static Generator getInstance() {
//        return ourInstance;
//    }
//
//    private Generator() {
//    }

    private int numerek = 1;

    public int pobierzNastepnyNumerek (){
        return numerek++;
    }
}
