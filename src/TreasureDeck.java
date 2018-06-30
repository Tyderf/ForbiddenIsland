public class TreasureDeck extends Deck {

    public TreasureDeck(int deckSize) {

        super(deckSize);

    }

    public void addCardsToDeck() {

        this.deck.add(new TreasureCard("Fire Card"));
        this.deck.add(new TreasureCard("Fire Card"));
        this.deck.add(new TreasureCard("Fire Card"));
        this.deck.add(new TreasureCard("Fire Card"));
        this.deck.add(new TreasureCard("Fire Card"));

        this.deck.add(new TreasureCard("Moon Card"));
        this.deck.add(new TreasureCard("Moon Card"));
        this.deck.add(new TreasureCard("Moon Card"));
        this.deck.add(new TreasureCard("Moon Card"));
        this.deck.add(new TreasureCard("Moon Card"));

        this.deck.add(new TreasureCard("Lion Card"));
        this.deck.add(new TreasureCard("Lion Card"));
        this.deck.add(new TreasureCard("Lion Card"));
        this.deck.add(new TreasureCard("Lion Card"));
        this.deck.add(new TreasureCard("Lion Card"));

        this.deck.add(new TreasureCard("Chalice Card"));
        this.deck.add(new TreasureCard("Chalice Card"));
        this.deck.add(new TreasureCard("Chalice Card"));
        this.deck.add(new TreasureCard("Chalice Card"));
        this.deck.add(new TreasureCard("Chalice Card"));

        this.deck.add(new WatersRiseCard("Water Rise"));
        this.deck.add(new WatersRiseCard("Water Rise"));
        this.deck.add(new WatersRiseCard("Water Rise"));

        this.deck.add(new HelicopterLiftCard("Helicopter Lift"));
        this.deck.add(new HelicopterLiftCard("Helicopter Lift"));
        this.deck.add(new HelicopterLiftCard("Helicopter Lift"));

        this.deck.add(new SandbagCard("Sandbags"));
        this.deck.add(new SandbagCard("Sandbags"));
        this.deck.add(new SandbagCard("Sandbags"));

    }
}
