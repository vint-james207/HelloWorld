/**
 * Created by jamesyburr on 5/16/16.
 */
public class Game {
    String name;
    int cards;
    int players;
    boolean isTough;

    public Game(String name, int cards, int players, boolean isTough) {
        this.name = name;
        this.cards = cards;
        this.players = players;
        this.isTough = isTough;
    }

    public String getName () {
        return name;
    }

    public void setName (String newName) {
        newName = name;
    }

    public int getCards () {
        return cards;
    }

    public void setNewCards (int newCards) {
        newCards = cards;
    }

    public int getPlayers () {
        return players;
    }

    public void setNewPlayers (int newPlayers) {
        if (newPlayers < 3)
            newPlayers = players;
    }

    public boolean getIsTough () {
        return isTough;
    }

    public void setNewIsTough (boolean newIsTough) {
        newIsTough = isTough;
    }
}
