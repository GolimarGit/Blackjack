public class Card {
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }
    
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN,
        KING
    }

    public Rank rank;
    public Suit suit;
    public int cardValue;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;

        switch (rank) {
            case ACE:
                this.cardValue = 11;
                break;
            case TWO:
                this.cardValue = 2;
                break;
            case THREE:
                this.cardValue = 3;
                break;
            case FOUR:
                this.cardValue = 4;
                break;
            case FIVE:
                this.cardValue = 5;
                break;
            case SIX:
                this.cardValue = 6;
                break;
            case SEVEN:
                this.cardValue = 7;
                break;
            case EIGHT:
                this.cardValue = 8;
                break;
            case NINE:
                this.cardValue = 9;
                break;
            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                this.cardValue = 10; // Face cards are worth 10
        }
    }

    // Change Ace from 11 to 1
    public void changeAceValue() {
        if (rank == Rank.ACE) {
            cardValue = 1;
        }
    }
}