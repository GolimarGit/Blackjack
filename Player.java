import java.util.ArrayList;

public class Player {
    ArrayList<Hand> handList;
    int balance;
    Deck deck; // The deck is shared between all players and the dealer

    public Player(Deck deck, int initialBalance) {
        this.handList = new ArrayList<>();
        this.balance = initialBalance;
        this.deck = deck;
    }

    public void makeHand() {
        Hand hand = new Hand();
        handList.add(hand);
    }

    // Draw a card from the deck to a hand
    // This updates the hand's value
    // returns the drawn card
    public Card hit(Hand hand) {
        Card card = deck.drawCard();
        hand.addCard(card);
        return card;
    }

    public void stand() {
        
    }

    public void doubleDown() {
        
    }

    public void split() {
        
    }

    public void insurance() {
        
    }

    public void surrender() {
        
    }
}