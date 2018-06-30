import java.util.ArrayList;

public class PlayerHand{

    ArrayList<Card> playerHand;
    public PlayerHand() {
        playerHand = new ArrayList<>(5);
    }

    public String showPlayerHand() {

        StringBuilder cardsInHand = new StringBuilder();

        for (Card card : this.playerHand) {
            int cardIndex = this.playerHand.indexOf(card);
            cardsInHand.append(this.playerHand.get(cardIndex).cardName);
            cardsInHand.append(" ");
        }

        cardsInHand.deleteCharAt(-1);
        
        return "Cards in hand: " + cardsInHand;
    }

    public ArrayList<Card> getPlayerHand() {
        return this.playerHand;
    }

    public ArrayList<TreasureCard> getPlayerTreasureCards() {
        ArrayList<TreasureCard> treasureCardsInPlayerHand = new ArrayList<>();

        for (Card card : this.playerHand) {
            if (card.getCardType().equals("treasureCard"))
                treasureCardsInPlayerHand.add(this.playerHand.get(0));
        }
    }

    // An array of cards for the player

    // Player hand is dealt to player at the start of the game;  It deals 2 cards
    // Player hand can be traded in
}
