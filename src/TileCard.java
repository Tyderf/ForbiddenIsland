public class TileCard extends Card {
    public TileCard(String cardName) {
        super("tileCard", cardName);
    }

    public String showCardInfo() {
        String[] tileCardName = cardName.split(" ");
        String tileName = tileCardName[0];
        return "When this card is drawn, " + tileName + " will flood or if already flooded it will sink.";
    }
}
