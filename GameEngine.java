import java.util.Scanner;

public class GameEngine {
    private Deck deck;
    private Hand dealerHand;
    private Player player;

    public void setup() {
        deck = new Deck();

        // Create the dealer's hand
        dealerHand = new Hand();
        for (int i = 0; i < 2; i++) {
            dealerHand.addCard(deck.drawCard());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your initial (integer value) balance?");
        int initialBalance = scanner.nextInt();
        player = new Player(initialBalance);
        // Create the first hand for the player
        player.makeHand();
        for (int i = 0; i < 2; i++) {
            player.hit(deck, player.handList.get(0));
        }
        player.printHand(0);
    }

    public void mainGameLoop() {
        boolean keepPlaying = true;

        while (keepPlaying) {
            // TODO: implement Scanner input if the Player has more than one hand
        }
    }
}