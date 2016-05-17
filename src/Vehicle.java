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

    public void setNewName (String newName) {
        name= newName;

    }

    public String getType () {
        return type;
    }

    public void setNewType (String newType) {
        type = newType;
    }

    public String getColor () {
        return color;
    }

    public void setNewColor (String newColor) {
        color = newColor;
    }

    public int getYear () {
        return year;
    }

    public void setNewYear (int newYear) {
        if (newYear <= 1990)
            year = newYear;
    }



}
