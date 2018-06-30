public class Card {

    // Card types
    String cardType;
    String cardName;

    public Card(String cardType, String cardName) {
        cardType = cardType;
        cardName = cardName;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String showCardInfo() {
        return null;
    }

    // Has an ability

    // Cards fill the deck and player hand
    // Cards can be used for abilities
    // Treasure cards can be used to collect treasure
}
