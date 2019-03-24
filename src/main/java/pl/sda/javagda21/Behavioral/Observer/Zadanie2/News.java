package pl.sda.javagda21.Behavioral.Observer.Zadanie2;

import lombok.Data;

@Data
public class News {
    private int level;
    private String message;

    public News(int level, String message) {
        this.level = level;
        this.message = message;
    }
}
