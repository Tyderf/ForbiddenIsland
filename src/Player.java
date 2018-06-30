public class Player {

    Career playerCareer;

    public Player(Career playerCareer) {
        playerCareer = playerCareer;
    }

    public String getPlayerCareer() {
        return playerCareer.getCareerInfo();
    }

    // Player has certain career that gives them a unique ability
    // Player has a hand
    // Player has 3 actions they can do each turn


    // Player can collect treasure
    // Player can trade cards in for new ones
    // Player can move onto above and below water tiles
    // Player can shore up below water tiles with action or sandbag card
    // Player can use helicopter lift card to travel to any non sunken tile
    // Player can use helicopter lift card to escape island
}
