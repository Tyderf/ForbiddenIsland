import java.util.ArrayList;

public class Treasure {

    String treasureName;

    public Treasure(String treasureName) {
        treasureName = treasureName;
    }

    public String getTreasureName() {
        return this.treasureName;
    }

    public Treasure collectTreasure(PlayerHand playerHand) {

        // First see if player has 4 of matching treasure card
        int matchingTreasureCards = 0;

        for (TreasureCard treasureCard : playerHand.getPlayerHand())
            if (card.getCardType().equals("treasureCard") && card.g)

        return null;
    }

    // A collectible item gained by sacrificing 4 cards of the treasure type

    // Treasure goes on treasure one of 2 of the corresponding treasure tiles
    // Treasure can be collected with 4 corresponding treasure cards
    // Treasure is destroyed if it's tile sinks
}
