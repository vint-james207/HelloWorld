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

    public String setName (String newName) {
        return newName;
    }

    public int getCards () {
        return cards;
    }

    public int setNewCards (int newCards) {
        return newCards;
    }

    public int getPlayers () {
        return players;
    }

    public int setNewPlayers (int newPlayers) {
        return newPlayers;
    }

    public boolean getIsTough () {
        return isTough;
    }

    public boolean setIsTough (boolean newIsFresh) {
        return newIsFresh;
    }
}
