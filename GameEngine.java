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
        player.handList.get(0).setPlacedBet(bet);;
        for (int i = 0; i < 2; i++) {
            player.hit(deck, player.handList.get(0));
        }

        printDealerHand();
        System.out.println("");
        player.printHand(0);

        // TODO: implement insurance
        // TODO: implement double down
        // TODO: implement split
        // TODO: implement surrender
    }

    public void mainGameLoop() {
        boolean keepPlaying = true;

        while (keepPlaying) {
            
        }
        scanner.close();
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