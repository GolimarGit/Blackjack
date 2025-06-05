import java.util.ArrayList;

public class Player {
    ArrayList<Hand> handList;
    int balance;

    public Player(int initialBalance) {
        this.handList = new ArrayList<>();
        this.balance = initialBalance;
    }

    public void makeHand() {
        Hand hand = new Hand();
        handList.add(hand);
    }

    // Draw a card from the deck to a hand
    // This updates the hand's value
    // returns the drawn card
    public Card hit(Deck deck, Hand hand) {
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

    public void printHand(int handIndex) {
        System.out.println("HAND " + handIndex + " {");
        for (int i = 0; i < handList.get(handIndex).getCards().size(); i++) {
            Card card = handList.get(handIndex).getCards().get(i);
            System.out.println("    " + card.rank + " of " + card.suit + " (Value: " + card.cardValue + ")");
        }
        System.out.println('}');
    }
}