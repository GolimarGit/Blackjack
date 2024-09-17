#include "Card.h";
#include "Deck.h";
#include "Hand.h";
#include <iostream>;

using namespace std;

class Game
{
    private:
        Deck deck;
        Hand player;
        Hand dealer;
        bool player_turn;
        bool dealer_turn;
        bool player_busted;
        bool dealer_busted;
        bool player_blackjack;
        bool dealer_blackjack;
        bool player_win;
        bool dealer_win;
        bool tie;
        bool game_over;

    public:
        Game();
        void play();
};
