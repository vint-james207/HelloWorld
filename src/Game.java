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
}
