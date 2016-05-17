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

    public String setNewName (String newName) {
        return newName;
    }

    public String getColor () {
        return color;
    }

    public String setNewColor (String newColor) {
        return newColor;
    }

    public String getType () {
        return type;

    }

    public String setNewType (String newType) {
        return newType;
    }

    public int getQuantity () {
        return quantity;
    }

    public int setNewQuantity (int newQuantity) {
        return newQuantity;
    }
}

