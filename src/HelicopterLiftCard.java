public class HelicopterLiftCard extends Card {
    public HelicopterLiftCard(String cardName) {
        super("helicopterLiftCard", cardName);
    }

    public String showCardInfo() {
        return "Move to any other tile." +
                "--------or--------" +
                "Lift off of Fools' Landing to win." +
                "" +
                "" +
                "Play at any time." +
                "Does not count as an action.";
    }
}
