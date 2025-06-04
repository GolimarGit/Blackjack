public class Deck {
    private Card[] cards;

    public Deck() {
        cards = new Card[52];
        // Initialize the deck with all cards
        int index = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards[index++] = new Card(rank, suit);
            }
        }

        // Shuffle the deck (using the fisher-yates shuffle algorithm)
        for (int i = cards.length - 1; i > 0; i--) {
            // Select a random int between 0 and i
            int j = (int) (Math.random() * (i + 1));
            
            // Swap cards[i] with the cards[j]
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }
}