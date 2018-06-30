public class SandbagCard extends Card {
    public SandbagCard(String cardName) {
        super("sandbagCard", cardName);
    }

    public String showCardInfo() {
        return "Shore up any one tile on the island." +
                "" +
                "" +
                "Play at any time." +
                "Does not count as an action.";
    }
}
