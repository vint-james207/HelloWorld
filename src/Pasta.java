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

    public void setName (String newName) {
        newName = name;
    }

    public String getType () {
        return type;
    }

    public void setType (String newType) {
        newType = type;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setNewQuantity (int newQuantity) {
        if (newQuantity <= 15)
            newQuantity = quantity;
    }
}
