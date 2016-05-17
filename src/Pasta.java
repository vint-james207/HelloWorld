/**
 * Created by jamesyburr on 5/16/16.
 */
public class Pasta {
    String name;
    String type;
    int quantity;

    public Pasta (String name, String type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public String getName () {
        return name;
    }

    public String setName (String newName) {
        return newName;
    }

    public String getType () {
        return type;
    }

    public String setType (String newType) {
        return newType;
    }

    public int getQuantity () {
        return quantity;
    }

    public int setNewQuantity (int newQuantity) {
        return newQuantity;
    }
}
