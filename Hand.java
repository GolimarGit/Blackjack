import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int value;
    private int placedBet;

    public Hand() {
        cards = new ArrayList<>();
        value = 0;
        placedBet = 0;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // TODO: implement value calculation after hit
    private int getValue() {
        return value;
    }

    // TODO: implement adding higher value bet
    private int getPlacedBet() {
        return placedBet;
    }
}