package pl.sda.javagda21.Creational.Builder.Zadanie1;

public class GameCharacter {
   private String name;
   private int health;
   private int mana;
   private int numberOfPoints;


    public GameCharacter(String name, int health, int mana, int numberOfPoints) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.numberOfPoints = numberOfPoints;
    }

    public static class Builder {
        private String name;
        private int health;
        private int mana;
        private int numberOfPoints;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public GameCharacter create (){
            return new GameCharacter(name,  health,  mana,  numberOfPoints);
        }
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }
}
