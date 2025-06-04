![luigi](https://github.com/user-attachments/assets/a652bd9e-3910-440c-8256-e72fca1dbf2e)

# Blackjack
Refreshing my memory of OOP with Java.
This code will be used in StoryTime-Productions's [Minecraft server project](https://github.com/StoryTime-Productions/Stweaks).

This blackjack simulator will incoporate the following player actions:

### Double Down
When you double down, you bet the same amount you originally bet and the dealer gives you one more card on that hand but you cannot hit anymore.
You must wait until the dealer reaches 17 (or over) or busts.

### Split
When you receive 2 cards of the same number, you have the option of splitting.
The second card becomes another *hand* with the same bet originally placed on it (so now you bet double)
You can keep splitting as long as you get the same card, then you can play the round normally.
> Note:	you cannot hit on an ace card

### Insurance
When the dealer's first card is an ace, you can bet for insurance: whether the hole (second, face-down) card will be a face card or not.
This prevents losing your bet to the dealer (2 to 1: breaking even).
Though, many experienced players do not recommended paying insurance.

### Surrendering
Surrendering means that you give up half your bet.
- Early surrender option only BEFORE the dealer checks their hole card.
- Late surrender option only AFTER the dealer checks hole card.
  > Note: some casinos do not offer late surrenderring
