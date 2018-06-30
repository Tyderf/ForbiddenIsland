import java.util.ArrayList;

public class Deck {

    ArrayList<Card> deck;
    // An array of cards

    public Deck(int deckSize) {
        deck = new ArrayList<>(deckSize);
        addCardsToDeck();
        shuffleDeck();
    }

    public void addCardsToDeck() {
    }

    // Deck can be dealt
    public Card dealCard() {
        Card card = this.deck.get(0);
        this.deck.remove(0);
        return card;
    }

    // Deck can be shuffled
    public void shuffleDeck() {

        ArrayList<Card> shuffleHand = this.deck;
        this.deck.clear();
        // Card currentCard;

        // Get max deck size

        // Pull all cards out one at a time
        // Give each card a random location between 0 and max deck size
        // Add it all back bitch
        int newLocation;
        for (Card card : shuffleHand) {
            newLocation = (int) (Math.random() * this.deck.size() + 1);
            this.deck.add(newLocation, card);
        }

    }
}
