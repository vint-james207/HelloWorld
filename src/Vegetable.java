/**
 * Created by jamesyburr on 5/16/16.
 */
public class Vegetable {
    String name;
    String color;
    String type;
    int quantity;

    public Vegetable(String name, String color, String type, int quantity) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public void setNewName (String newName) {
        name = newName;
    }

    public String getColor () {
        return color;
    }

    public void setNewColor (String newColor) {
        color = newColor;
    }

    public String getType () {
        return type;

    }

    public void setNewType (String newType) {
        type = newType;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setNewQuantity (int newQuantity) {
        if (newQuantity != 10)
            newQuantity = quantity;

    }
}

