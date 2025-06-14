import java.util.ArrayList;

public class Player {
    private ArrayList<Hand> handList;
    private int balance;

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

    public ArrayList<Hand> getHandList() {
        return handList;
    }

    public int getBalance() {
        return balance;
    }

    public void printHand(int handIndex) {
        System.out.println("HAND " + handIndex + " {");
        for (int i = 0; i < handList.get(handIndex).getCards().size(); i++) {
            Card card = handList.get(handIndex).getCards().get(i);
            System.out.println("    " + card.rank + " of " + card.suit + " (Value: " + card.cardValue + ")");
        }
        System.out.println("    Hand Value: " + handList.get(handIndex).getHandValue());
        System.out.println("    Placed Bet: " + handList.get(handIndex).getPlacedBet());
        System.out.println('}');
    }
}