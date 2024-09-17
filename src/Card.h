class Card
{
    private:
        string suit;
        string rank; // (Ace, 2, 3, ..., Jack, Queen, King)
        int value; // the numerical value of the card; to remove?
    
    public:
        Card(string rank, string suit);
        void display(); // returns "[rank] of [suit]"
        int getValue(); // returns the value of the card
};
