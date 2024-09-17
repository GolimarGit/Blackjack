#include "Card.h";

class Deck
{
    private:
        Card deck[52]; // a deck of 52 cards

    public:
        Deck();
        void shuffle();
        Card deal_card(); // returns the top card of the deck, then point to next
        void print(); // prints the deck of cards
};
