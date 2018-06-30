public class TreasureCard extends Card {

    public TreasureCard(String cardName) {
        super("treasureCard", cardName);
    }

    public String showCardInfo() {

        return "Collect 4 of these " + cardName + "s to retrieve the treasure of that card.";
    }

    public String getTreasureCardType() {
        String[] treasureCardType = this.cardName.split(" ");
        return treasureCardType[0];
    }
}
