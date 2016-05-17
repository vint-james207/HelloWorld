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

    public void setColor (String newColor) {
            newColor = color;
    }

    public String getName () {
        return name;
    }

    public void setName (String newName) {
        newName = name;
    }

    public boolean getIsFresh() {
        return isFresh;
    }

    public void setIsFresh (boolean newIsFresh) {
        newIsFresh = isFresh;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setNewQuantity (int newQuantity) {
        if (newQuantity > 100)
            newQuantity = quantity;
    }
}

