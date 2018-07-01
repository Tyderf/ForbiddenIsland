package ForbiddenIsland;

import ForbiddenIsland.CardType;

public class Card {

    // Card types
    CardType cardType;
    String cardName;
    String cardBody

    public Card(CardType cardType, String cardName, String cardBody) {
        cardType = cardType;
        cardName = cardName;
        cardBody = cardBody;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCardBody() { return this.cardBody; }

    public String showCardInfo() {
        return null;
    }

    // Has an ability

    // Cards fill the deck and player hand
    // Cards can be used for abilities
    // Treasure cards can be used to collect treasure
}
