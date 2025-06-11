import java.util.Scanner;

public class GameEngine {
    private Deck deck;
    private Hand dealerHand;
    private Player player;
    private Scanner scanner;

    public void setup() {
        deck = new Deck();

        // Create the dealer's hand
        dealerHand = new Hand();
        for (int i = 0; i < 2; i++) {
            dealerHand.addCard(deck.drawCard());
        }

        scanner = new Scanner(System.in);
        System.out.println("What is your initial (integer value) balance?");
        int initialBalance = scanner.nextInt();
        player = new Player(initialBalance);

        // Create the first hand for the player
        System.out.println("How much will you bet (integer)?");
        int bet = scanner.nextInt();
        System.out.println();

        player.makeHand();
        player.getHandList().get(0).setPlacedBet(bet); // does this actually work
        for (int i = 0; i < 2; i++) {
            player.hit(deck, player.getHandList().get(0)); // does this actually work
        }

        // Only show dealer's upcard
        Card card = dealerHand.getCards().get(0);
        System.out.println("DEALER'S UPCARD{\n    " + card.rank + " of " + card.suit + " (Value: " + card.cardValue + ")");
        System.out.println("    Upcard Value: " + card.cardValue);
        System.out.println('}');

        if (insuranceCheck()) {
            System.out.println("Would you like to take insurance? [Y/y or <Enter> to accept]");
            char insuranceChoice = scanner.next().charAt(0);
            if (insuranceChoice == 'Y' || insuranceChoice == 'y' || insuranceChoice == '\n') {
                // TODO: insurance logic
            }
            else {
                System.out.println("You chose not to take insurance.\n");
            }
        }

        // Ask to double down

    }

    public void mainGameLoop() {
        boolean keepPlaying = true;

        while (keepPlaying) {
            askPlayerMove();
            printDealerHand();
        }
        scanner.close();
    }
    
    public void askPlayerMove() {
        for (int i = 0; i < player.getHandList().size(); i++) {
            player.printHand(i);
            System.out.println("");
        }
        System.out.println("Current balance: " + player.getBalance());

        // Ask to double down if hand has 2 cards
        if (player.getHandList().get(0).getCards().size() == 2) {
            System.out.println("Do you want to double down? [Y/y or <Enter> to accept]");
            char doubleDownChoice = scanner.next().charAt(0);
            if (doubleDownChoice == 'Y' || doubleDownChoice == 'y' || doubleDownChoice == '\n') {
                // TODO: player double down logic
            }
            else {
                System.out.println("You chose not to double down.\n");
            }
        }

        System.out.println("What would you like to do?\n1. Surrender");

        boolean canStillHit = false;
        for (int i = 0; i < player.getHandList().size(); i++) {
            if (!over21(player.getHandList().get(i))) {
                canStillHit = true;
                break; // As long as one hand is under 21, player can still hit
            }
        }

        if (canStillHit) {
            System.out.println("2. Hit");
            System.out.println("3. Stand");
        }
    
        // TODO: implement split
        if (canSplit()) {
            System.out.println("4. Split");
        }
        // split here
    
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("You chose to surrender.");
        }
        else if (choice == 2) {
            System.out.println("You chose to hit.");
        }
        else if (choice == 3) {
            System.out.println("You chose to stand.");
        }
        else if (canSplit() && choice == 4) {
            System.out.println("You chose to split.");
        }
        else {
            System.out.println("Invalid choice.\n");
        }
    }

    public boolean over21(Hand hand) {
        return hand.getHandValue() > 21;
    }

    // TODO: implement insurance
    public boolean insuranceCheck() {
        return false;
    }

    // TODO: implement split
    public boolean canSplit() {
        return false;
    }

    public void play() {
        setup();
        mainGameLoop();
    }

    public void printDealerHand() {
        System.out.println("DEALER'S HAND {");
        for (int i = 0; i < dealerHand.getCards().size(); i++) {
            Card card = dealerHand.getCards().get(i);
            System.out.println("    " + card.rank + " of " + card.suit + " (Value: " + card.cardValue + ")");
        }
        System.out.println("    Hand Value: " + dealerHand.getHandValue());
        System.out.println('}');
    }
}