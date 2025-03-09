import java.util.ArrayList;
import java.util.Random;

public class PlayingCard {
    private String suite;
    private String value;

    public PlayingCard(String suite, String value) {
        this.suite = suite;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + " of " + this.suite;
    }
    static class Main {
        Random myrand = new Random();
        String[] suites =
                {"Clubs","Diamonds","Hearts","Spades"};
        String[] values =
                {"A","2","3","4","5","6","7","8","9","10","J",
                        "Q","K"};
        
    }
}