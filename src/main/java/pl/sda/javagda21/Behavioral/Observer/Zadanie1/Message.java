package pl.sda.javagda21.Behavioral.Observer.Zadanie1;

import lombok.Data;

@Data
public class Message {
    private int level;
    private String message;

    public Message(int level, String message) {
        this.level = level;
        this.message = message;
    }
}
