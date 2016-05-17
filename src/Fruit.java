/**
 * Created by jamesyburr on 5/16/16.
 */
public class Fruit {
    String color;
    String name;
    boolean isFresh;
    int quantity;

    public Fruit (String color, String name, boolean isFresh, int quantity){
        this.color = color;
        this.name = name;
        this.isFresh = isFresh;
        this.quantity = quantity;
    }

    public String getColor () {
        return color;
    }

    public String setColor (String newColor) {
        return newColor;
    }

    public String getName () {
        return name;
    }

    public String setName (String newName) {
        return newName;
    }

    public boolean getIsFresh() {
        return isFresh;
    }

    public boolean setIsFresh (boolean newIsFresh) {
        return newIsFresh;
    }

    public int getQuantity () {
        return quantity;
    }

    public int setNewQuantity (int newQuantity) {
        return newQuantity;
    }
}

