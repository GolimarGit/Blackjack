import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        // Initialize the deck with all cards
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }

        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        
        return cards.remove(0);
    }
}