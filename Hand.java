import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int handValue;
    private int placedBet;
    private int aceCount;

    private boolean hasAce() {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).rank == Card.Rank.ACE) {
                return true;
            }
        }
        return false;
    }

    public Hand() {
        cards = new ArrayList<>();
        handValue = 0;
        placedBet = 0;
        aceCount = 0;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);

        // Increment aceCount if the card is an Ace
        if (card.rank == Card.Rank.ACE) {
            aceCount++;
            // Check if there are other Ace cards in the Hand
            if (aceCount > 1) {
                card.cardValue = 1; // Change the value of the Ace to 1
            }
        }

        // Change the value of an existing Ace to 1 if the total value exceeds 21
        if (handValue > 21 && hasAce()) {
            for (int i = 0; i < cards.size(); i++) {
                if (cards.get(i).rank == Card.Rank.ACE && cards.get(i).cardValue == 11) {
                    cards.get(i).changeAceValue();
                    break; // Only change one Ace to 1
                }
            }
        }

        handValue += card.cardValue;

        // TODO: what if the hand's value is 21
        // TODO: what if the hand's value exceeds 21
    }

    // TODO: implement value calculation after hit
    public int getHandValue() {
        return handValue;
    }

    // TODO: implement adding higher value bet
    public int getPlacedBet() {
        return placedBet;
    }

    public void setPlacedBet(int placedBet) {
        this.placedBet = placedBet;
    }
}