#include "Card.h";

class Hand
{
    public:
        Hand();
        void add_card(Card card);
        int get_total_value();
        int size();
        void clear();
};
