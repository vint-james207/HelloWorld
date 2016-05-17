/**
 * Created by jamesyburr on 5/16/16.
 */
public class Vehicle {
    String name;
    String type;
    String color;
    int year;

    public Vehicle(String name, String type, String color, int year){
        this.name = name;
        this.type = type;
        this.color = color;
        this.year = year;

    }

    public String getName () {
        return name;
    }

    public String setNewName (String newName) {
        return newName;
    }

    public String getType () {
        return type;
    }

    public String setNewType (String newType) {
        return newType;
    }

    public String getColor () {
        return color;
    }

    public String setNewColor (String newColor) {
        return newColor;
    }

    public int getYear () {
        return year;
    }

    public int setNewYear (int newYear) {
        return newYear;
    }
}
